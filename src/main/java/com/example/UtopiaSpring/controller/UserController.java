package com.example.UtopiaSpring.controller;


import com.example.UtopiaSpring.model.User;
import com.example.UtopiaSpring.service.JWTService;
import com.example.UtopiaSpring.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private JWTService jwtService;

    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("signup")
    public Map<String, String> register(@RequestBody User user) {
        User registeredUser = service.saveUser(user);
        User user1 = service.getUser(registeredUser.getUsername());
        Map<String, String> res = new HashMap<>();
        try {
            res.put("user", user.getUsername());
            res.put("status", "success");
            res.put("token", jwtService.generateToken(user.getUsername()));
            return res;
        } catch (Exception e) {
            res.put("message", e.getMessage());
            return res;
        }
    }

    @PostMapping("login")
    public Map<String, String> login(@RequestBody User user) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        Map<String, String> response = new HashMap<>();
        if (authentication.isAuthenticated()) {
            response.put("user", user.getUsername());
            response.put("status", "success");
            response.put("token", jwtService.generateToken(user.getUsername()));
            System.out.println(response);
        }
        return response;
    }
}