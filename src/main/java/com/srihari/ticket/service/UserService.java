package com.srihari.ticket.service;

import com.srihari.ticket.entity.User;
import com.srihari.ticket.repo.UserRepo;
import com.srihari.ticket.util.HashUtil;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo repo;
    public UserService(UserRepo repo){ this.repo = repo; }

    public User register(String name, String email, String password){
        if(repo.findByEmail(email).isPresent()) throw new RuntimeException("Email already registered");
        User u = new User();
        u.setName(name);
        u.setEmail(email);
        u.setPasswordHash(HashUtil.sha256(password));
        return repo.save(u);
    }
}
