package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.jfsd.springboot.security.JWTUtilities;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController 
{

    @Autowired
    JWTUtilities utilities;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) 
    {
        // Dummy credentials
        if (username.equals("admin") && password.equals("admin")) 
        {
            return utilities.generateToken(username, "ADMIN");
        } 
        else if (username.equals("user") && password.equals("user")) 
        {
            return utilities.generateToken(username, "USER");
        } 
        else 
        {
            return "Invalid Credentials";
        }
    }

    @GetMapping("/validate/{token}")
    public Map<String, String> validate(@PathVariable String token) 
    {
        return utilities.validateToken(token);
    }
}
