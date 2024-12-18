package com.springboot.rest.api.controller;

import com.springboot.rest.api.beans.UserData;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PutMappingController {

    @PutMapping("/updateUserDetails")
    public UserData updateUserDetails(@RequestBody UserData userData){
        System.out.println("Updating the user data!...");
        userData.setId(145);
        return userData;
    }
}
