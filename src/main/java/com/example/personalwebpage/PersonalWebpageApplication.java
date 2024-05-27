package com.example.personalwebpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PersonalWebpageApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalWebpageApplication.class, args);
    }
}

@Controller
class WebController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
