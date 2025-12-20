package com.klef.fsd.sdp.zerodha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klef.fsd.sdp.zerodha.model.Buyer;
import com.klef.fsd.sdp.zerodha.service.BuyerService;

@RestController
public class BuyerController {

    @Autowired
    private BuyerService service;

    @PostMapping("/signup")
    public ResponseEntity<String> register(@RequestBody Buyer b) {
        try {
            String result = service.registration(b);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(500).body("Registration failed: " + e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Buyer b) {
        try {
            Buyer a = service.login(b.getName(), b.getPassword());
            if (a != null) {
                return ResponseEntity.ok(a);
            } else {
                return ResponseEntity.status(401).body("Invalid Username or Password");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(500).body("Login failed: " + e.getMessage());
        }
    }
}
