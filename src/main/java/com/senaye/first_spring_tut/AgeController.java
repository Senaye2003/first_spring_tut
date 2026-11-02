package com.senaye.first_spring_tut;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeController {
    @GetMapping (path = "/hello")
    public int age(){
        return 12;
    }



}
