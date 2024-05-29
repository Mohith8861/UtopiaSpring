package com.example.UtopiaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class UtopiaSpringSecApplication {

    public static void main(String[] args) {
        SpringApplication.run(UtopiaSpringSecApplication.class, args);
    }

}
