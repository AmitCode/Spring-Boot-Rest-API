package com.springboot.rest.api.controller;

import com.springboot.rest.api.beans.UserData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class GetMappingController {
    @GetMapping("/getUserDetails")
    public UserData getUserDetails(){
        UserData userData =new UserData("Amit Kumar Pandey",00012,25);
        System.out.println("Getting UserData!....");
        return userData;
    }

    @GetMapping("/listOfUserDetails")
    public List<UserData> listOfUserDetails(){
        List<UserData> userDataList = new ArrayList<>();
        UserData userData1 =new UserData("Amit Kumar Pandey",00014,25);
        UserData userData2 =new UserData("Aman Kumar Pandey",00012,25);
        userDataList.add(userData1);
        userDataList.add(userData2);
        System.out.println("Getting list of user!....s");
        return userDataList;
    }

    //Spring Boot Rest API as a Path Variable

    @GetMapping("/getUserDetailsPathVar/{userName}/{userId}/{userAge}")
    public UserData getUserDetailsPathVar(@PathVariable("userName") String uName,
                                          @PathVariable("userId") int uId,@PathVariable("userAge") int uAge){
        return new UserData(uName,uId,uAge);
    }

    //Spring boot rest api for path param


    @GetMapping("/getUserDetailsPathParam")
    //Method Name can be anything.
    //You can use RequestParam as @RequestParam("userName") @RequestParam("userName")
    public UserData getUserDetailsPathParam(@RequestParam("userName") String uName,
                                            @RequestParam("userId") int uId,
                                            @RequestParam("userAge") int uAge){
        return new UserData(uName,uId,uAge);
    }
}
