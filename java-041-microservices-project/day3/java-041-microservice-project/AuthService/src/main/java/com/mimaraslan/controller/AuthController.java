package com.mimaraslan.controller;

import com.mimaraslan.dto.request.DoLoginRequestDto;
import com.mimaraslan.dto.request.DoRegisterRequestDto;
import com.mimaraslan.dto.response.DoRegisterResponseDto;
import com.mimaraslan.model.Auth;
import com.mimaraslan.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.mimaraslan.constant.EndPoint.*;

//  http://localhost:9090/auth

@RestController
@RequestMapping(ENDPOINT_AUTH)
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

/*
    // http://localhost:9090
    @GetMapping("/")
    public String hello (){
        return "AuthService Hello";
    }


   // http://localhost:9090/info
    @GetMapping("/info")
    public String info (){
        return "INFO: AuthService";
    }
    */


    //  http://localhost:9090/auth/register
/*
    @PostMapping(ENDPOINT_REGISTER)
    public ResponseEntity<Auth> register (@RequestBody DoRegisterRequestDto dto) {
        System.out.println("Register request DTO: " + dto);
        return ResponseEntity.ok(authService.doRegister(dto));
}
*/


    @PostMapping(ENDPOINT_REGISTER)
    public ResponseEntity<DoRegisterResponseDto> register (@RequestBody DoRegisterRequestDto dto) {
        System.out.println("Register request DTO: " + dto);
        return ResponseEntity.ok(authService.doRegister(dto));
    }



    //  http://localhost:9090/auth/login

    @PostMapping(ENDPOINT_LOGIN)
    public  ResponseEntity<String>   login (@RequestBody DoLoginRequestDto dto) {
        return ResponseEntity.ok(authService.doLogin(dto)); }

    // Tokensiz
/*
    @GetMapping(ENDPOINT_FINDALL)
    public  ResponseEntity < List<Auth> > findAll () {
        return ResponseEntity.ok(authService.findAll()); }
    */

    //Tokenli
    @GetMapping(ENDPOINT_FINDALL)
    public  ResponseEntity < List<Auth> > findAll (@RequestParam String token) {
        return ResponseEntity.ok(authService.findAll(token)); }


    @GetMapping(ENDPOINT_GETMESSAGE)
    public  String   getMessage () {
        return null; }







}
