package com.example.sellphone;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})

public class SellPhoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellPhoneApplication.class, args);
    }

}
