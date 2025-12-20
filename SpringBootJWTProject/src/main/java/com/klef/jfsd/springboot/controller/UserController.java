package com.klef.jfsd.springboot.controller;

import com.klef.jfsd.springboot.security.JWTUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController 
{

    @Autowired
    JWTUtilities utilities;

    @GetMapping("/profile")
    public String userAccess(@RequestHeader("Authorization") String authHeader) 
    {
        String token = authHeader.substring(7);
        System.out.println(authHeader);
        Map<String, String> data = utilities.validateToken(token);

        if (data.get("code").equals("200") && "USER".equals(data.get("role"))) 
        {
            return "Welcome User: " + data.get("username");
        } 
        else 
        {
            return "Access Denied!";
        }
    }
}
