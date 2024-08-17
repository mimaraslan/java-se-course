package com.mimaraslan.manager;


import com.mimaraslan.dto.request.UserProfileSaveRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Her FeignClient'ın name kısmı benzersiz olmalıdır.
 * Kullanacağımız url: istek gönderdiğimiz sınıfın RequestMapping adresidir.
 */
@FeignClient(name = "user-profile-manager", url = "http://localhost:9091/user")
public interface IUserProfileManager {

    // http://localhost:9091/user/save
    @PostMapping("/save")
    ResponseEntity<Boolean> save(@RequestBody UserProfileSaveRequestDto dto);


}
