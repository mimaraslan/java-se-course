package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:80/fallback

@RestController
@RequestMapping("/fallback")
public class ApiGatewayController {

    // http://localhost:9090/fallback/fallbackForAuth
    @GetMapping("/fallbackForAuth")
    public String fallbackForAuth (){
        return "AuthService geçici olarak hizmet vermemektedir.";
    }

    // http://localhost:9091/fallback/fallbackForUser
    @GetMapping("/fallbackForUser")
    public String fallbackForUser (){
        return "UserProfileService geçici olarak hizmet vermemektedir.";
    }

    // http://localhost:9092/fallback/fallbackForAgent
    @GetMapping("/fallbackForAgent")
    public String fallbackForAgent (){
        return "AgentService geçici olarak hizmet vermemektedir.";
    }

    // http://localhost:9093/fallback/fallbackForBuyer
    @GetMapping("/fallbackForBuyer")
    public String fallbackForBuyer (){
        return "BuyerService geçici olarak hizmet vermemektedir.";
    }

    // http://localhost:9094/fallback/fallbackForProperty
    @GetMapping("/fallbackForProperty")
    public String fallbackForProperty (){
        return "PropertyService geçici olarak hizmet vermemektedir.";
    }

    // http://localhost:9095/fallback/fallbackForSeller
    @GetMapping("/fallbackForSeller")
    public String fallbackForSeller (){
        return "SellerService geçici olarak hizmet vermemektedir.";
    }

}
