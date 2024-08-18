package com.mimaraslan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import de.codecentric.boot.admin.server.config.EnableAdminServer;


@EnableAdminServer
@EnableEurekaServer
@SpringBootApplication
public class DashboardEurekaServerApp {

    public static void main(String[] args) {
        SpringApplication.run(DashboardEurekaServerApp.class, args);
    }

}
