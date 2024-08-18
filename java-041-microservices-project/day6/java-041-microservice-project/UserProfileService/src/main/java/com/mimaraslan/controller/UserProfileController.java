package com.mimaraslan.controller;

import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import com.mimaraslan.model.UserProfile;
import com.mimaraslan.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.mimaraslan.constant.EndPoint.*;


// http://localhost:9091/user

@RequiredArgsConstructor
@RestController
@RequestMapping(ENDPOINT_USER)
public class UserProfileController {

    private final UserProfileService userProfileService;

/*
    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }
    */


    //  http://localhost:9091/user/save
    @PostMapping(ENDPOINT_SAVE)
    public ResponseEntity<Boolean> save(@RequestBody UserProfileSaveRequestDto dto){
        userProfileService.save(dto);
        return ResponseEntity.ok(Boolean.TRUE);
    }



    // Tokensiz
    @GetMapping(ENDPOINT_FIND_ALL)
    public  ResponseEntity < List<UserProfile> > findAll () {
        return ResponseEntity.ok(userProfileService.findAll());
    }

/*
    //Tokenli
    @GetMapping(ENDPOINT_FIND_ALL)
    public  ResponseEntity <List<UserProfile>> findAll (@RequestParam String token) {
        return ResponseEntity.ok(userProfileService.findAll(token)); }
*/



    // http://localhost:9091/user/hello
    @GetMapping("/hello")
    public String hello (){
        return "UserProfileService Hello";
    }


    // http://localhost:9091/user/info
    @GetMapping("/info")
    public String info (){
        return "INFO: AuthService";
    }




}
