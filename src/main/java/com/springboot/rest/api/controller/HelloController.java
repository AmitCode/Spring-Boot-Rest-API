package com.springboot.rest.api.controller;

import com.springboot.rest.api.beans.UserData;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
//Or we can use @RestController as combination of these two i.e (@Controller,@ResponseBody)
public class HelloController {
    //HTTP Get Request
    //URL http://localhost:8080/sayHello
    @GetMapping("/sayHello")
    public String sayHello(){
        System.out.println("Saying Hello!...");
        return "Saying Hello!...";
    }
}
