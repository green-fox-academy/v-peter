package com.greenfoxacademy.urlaliasing;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UrlaliasingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UrlaliasingApplication.class, args);
    }

    public void run(String... args) {
        System.out.println("It is starting.");
    }


}

