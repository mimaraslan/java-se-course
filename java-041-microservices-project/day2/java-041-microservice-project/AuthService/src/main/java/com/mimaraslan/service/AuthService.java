package com.mimaraslan.service;

import com.mimaraslan.dto.request.DoLoginRequestDto;
import com.mimaraslan.dto.request.DoRegisterRequestDto;
import com.mimaraslan.dto.response.DoRegisterResponseDto;
import com.mimaraslan.model.Auth;
import com.mimaraslan.repository.IAuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

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

    public AuthService(IAuthRepository repository) {
        super(repository);
        this.repository = repository;
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

        Auth auth = new Auth();
        auth.setUsername(dto.getUsername());
        auth.setEmail(dto.getEmail());

        // TODO   Password  RePassword karşılaştırılması gerekli kadetmeden önce

        auth.setPassword(dto.getPassword());
        auth.setState(true);

        auth.setCreateAt(System.currentTimeMillis());

        save(auth);

        DoRegisterResponseDto responseDto = new DoRegisterResponseDto();
        responseDto.setId(auth.getId());
        responseDto.setUsername(auth.getUsername());
        responseDto.setEmail(auth.getEmail());

        return responseDto;
    }






    public String doLogin(DoLoginRequestDto dto) {

    Optional<Auth> auth = repository.findByUsernameAndPassword(dto.getUsername(), dto.getPassword());

    // FIXME kontrolle bu daha da iyi hale getirilebilinir
   /*
     if(auth.isEmpty()) {
        return auth.get().getId().toString();
    }
*/

        return auth.get().getId().toString();

    }


}
