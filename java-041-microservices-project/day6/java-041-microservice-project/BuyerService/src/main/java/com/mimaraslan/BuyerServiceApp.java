package com.mimaraslan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BuyerServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(BuyerServiceApp.class, args);
    }

}
