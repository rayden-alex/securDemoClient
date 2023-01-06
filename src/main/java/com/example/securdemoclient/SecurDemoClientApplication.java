package com.example.securdemoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SecurDemoClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurDemoClientApplication.class, args);
    }

}
