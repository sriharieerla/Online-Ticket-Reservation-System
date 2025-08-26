package com.srihari.ticket.controller;

import org.springframework.web.bind.annotation.*;
import com.srihari.ticket.service.UserService;
import com.srihari.ticket.entity.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService service;
    public UserController(UserService service){ this.service = service; }

    @PostMapping("/register")
    public User register(@RequestParam String name, @RequestParam String email, @RequestParam String password){
        return service.register(name, email, password);
    }
}
