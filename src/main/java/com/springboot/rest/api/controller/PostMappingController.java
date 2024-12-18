package com.springboot.rest.api.controller;

import com.springboot.rest.api.beans.UserData;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostMappingController {
    @PostMapping("/createNewUser")
    @ResponseStatus(HttpStatus.CREATED)
    public String createNewUser(@RequestBody UserData userData){
        System.out.println("User Name : "+userData.getName());
        System.out.println("User Id: " +userData.getId());
        System.out.println("User Age: " +userData.getAge());
        return "User is created";
    }

    @PostMapping("/createListOfUser")
    public String createListOfUser(@RequestBody List<UserData> userDetails){
        for(UserData userData : userDetails) {
            System.out.println("User Name : " + userData.getName());
            System.out.println("User Id: " + userData.getId());
            System.out.println("User Age: " + userData.getAge());
        }
        return "List of Users are created!...";
    }
}
