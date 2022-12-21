package com.example.springhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@SpringBootApplication
@Controller

public class SpringHelloApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Spring Boot");
        model.addAttribute("msg", "Hello World!");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringHelloApplication.class, args);
    }

}
