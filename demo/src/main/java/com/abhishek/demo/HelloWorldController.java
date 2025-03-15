package com.abhishek.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//It is an annotation
@RestController
public class HelloWorldController {
    @GetMapping(path = "/hello")

    public String helloWorld(){
        return "Hello Abhishek";
    }
}
