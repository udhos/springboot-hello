package com.example.quickstart1.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This class is a rest controller
public class HelloController {
    
    @RequestMapping("/hello") // Map all http methods for method /hello
    public String sayHi() {
        return "Hi";
    }
}