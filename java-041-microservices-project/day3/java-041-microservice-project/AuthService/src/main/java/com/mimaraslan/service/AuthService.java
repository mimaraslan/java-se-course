package com.mimaraslan.service;

import com.mimaraslan.dto.request.DoLoginRequestDto;
import com.mimaraslan.dto.request.DoRegisterRequestDto;
import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.dto.response.DoRegisterResponseDto;
import com.mimaraslan.execption.AuthServiceException;
import com.mimaraslan.execption.ErrorType;
import com.mimaraslan.manager.IUserProfileManager;
import com.mimaraslan.mapper.IAuthMapper;
import com.mimaraslan.model.Auth;
import com.mimaraslan.repository.IAuthRepository;
import com.mimaraslan.utils.JwtTokenManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@RequiredArgsConstructor //(onConstructor_ = {@Autowired})
@Service
public class AuthService extends ServiceManager<Auth, Long> {
 /*
    @Autowired
    private final IAuthRepository repository;
*/

/*
    private final IAuthRepository repository;

    public AuthService(IAuthRepository repository) {
        this.repository = repository;
    }
*/

    private final IAuthRepository repository;

    private final JwtTokenManager jwtTokenManager;

    // FeignClient inject
    private final IUserProfileManager userProfileManager;


    public AuthService(IAuthRepository repository, JwtTokenManager jwtTokenManager, IUserProfileManager userProfileManager) {
        super(repository);
        this.repository = repository;
        this.jwtTokenManager = jwtTokenManager;
        this.userProfileManager = userProfileManager;
    }




    public Auth doRegisterV1(DoRegisterRequestDto dto) {

        // TODO Parolayı belirli büyük küçük harf ve sayı olmaya zormaka için REGEX kalıpları kullanılır.
        /*
        String regExpn = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
        Pattern pattern = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(dto.getPassword());
     */

        //TODO Bu username var mı yok mu? Exception
        /*
        if (repository.existsByUsername(dto.getUsername())) {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        */

        Auth auth = new Auth();
        auth.setUsername(dto.getUsername());
        auth.setEmail(dto.getEmail());

        // TODO   Password  RePassword karşılaştırılması gerekli kadetmeden önce

        auth.setPassword(dto.getPassword());
        auth.setState(true);

        auth.setCreateAt(System.currentTimeMillis());

        save(auth);



        return auth;
    }


    public DoRegisterResponseDto doRegister(DoRegisterRequestDto dto) {

        // TODO Parolayı belirli büyük küçük harf ve sayı olmaya zormaka için REGEX kalıpları kullanılır.
        /*
        String regExpn = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
        Pattern pattern = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(dto.getPassword());
     */

        //TODO Bu username var mı yok mu? Exception
        /*
        if (repository.existsByUsername(dto.getUsername())) {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        */

      /*
        Auth auth = new Auth();
        auth.setUsername(dto.getUsername());
        auth.setEmail(dto.getEmail());
        // TODO   Password  RePassword karşılaştırılması gerekli kadetmeden önce
        auth.setPassword(dto.getPassword());
        auth.setState(true);
        auth.setCreateAt(System.currentTimeMillis());

        save(auth);
        */

        // Builder ile nesne - lombok ile nesne
    /*    Auth auth = Auth.builder()
                .username(dto.getUsername())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .state(true)
                .createAt(System.currentTimeMillis())
                .build();

        save(auth);
        */


        // Password ve RePassword
        if (!dto.getPassword().equals(dto.getRePassword())) {
            throw new AuthServiceException(ErrorType.REGISTER_PASSWORD_MISMATCH);
        }


/*
        Auth auth = save(
                Auth.builder()
                    .username(dto.getUsername())
                    .email(dto.getEmail())
                    .password(dto.getPassword())
                    .state(true)
                    .createAt(System.currentTimeMillis())
                    .build()
        );
*/

        Auth auth = IAuthMapper.INSTANCE.toAuth(dto);

            auth.setCreateAt(System.currentTimeMillis());
            auth.setState(true);

        save(auth);

        System.out.println("auth: " + auth);

     /*
        UserProfileSaveRequestDto saveDto = new UserProfileSaveRequestDto();
        saveDto.setAuthId(auth.getId());
        saveDto.setUsername(auth.getUsername());
        saveDto.setEmail(auth.getEmail());

        userProfileManager.save(saveDto);
        */

        // UserProfile servisindeki save metodunu çagırıyoruz.
        // http://localhost:9091/user/save

       userProfileManager.save(IAuthMapper.INSTANCE.fromAuth(auth));



        DoRegisterResponseDto responseDto = new DoRegisterResponseDto();
            responseDto.setId(auth.getId());
            responseDto.setUsername(auth.getUsername());
            responseDto.setEmail(auth.getEmail());

        return responseDto;
    }





    public String doLoginV1(DoLoginRequestDto dto) {

    Optional<Auth> auth = repository.findByUsernameAndPassword(dto.getUsername(), dto.getPassword());

        if(auth.isEmpty()) {
            throw new AuthServiceException(ErrorType.DOLOGIN_USERNAME_OR_PASSWORD_MISMATCH);
        }


        return auth.get().getId().toString();

    }



    public String doLogin(DoLoginRequestDto dto) {

        Optional<Auth> auth = repository.findByUsernameAndPassword(dto.getUsername(), dto.getPassword());



     if(auth.isEmpty()) {
       throw new AuthServiceException(ErrorType.DOLOGIN_USERNAME_OR_PASSWORD_MISMATCH);
    }


      // return auth.get().getId().toString();

        return jwtTokenManager.createToken(Long.valueOf(auth.get().getId().toString())).get();

    }




    public List<Auth> findAll(String token){

        Optional<Long> id = null;

        try {
            id = jwtTokenManager.getIdInfoFromToken(token);

        } catch (Exception e){
            throw new AuthServiceException(ErrorType.INVALID_TOKEN);
        }

        if (findById(id.get()).isEmpty())
            throw new AuthServiceException(ErrorType.INVALID_TOKEN);

        return repository.findAll();
    }







}
