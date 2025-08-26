package com.srihari.ticket.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name="users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true, nullable=false)
    private String email;
    @Column(nullable=false)
    private String name;
    @Column(nullable=false, length=64)
    private String passwordHash;
    private Instant createdAt = Instant.now();
    // getters/setters
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getEmail(){return email;} public void setEmail(String e){this.email=e;}
    public String getName(){return name;} public void setName(String n){this.name=n;}
    public String getPasswordHash(){return passwordHash;} public void setPasswordHash(String p){this.passwordHash=p;}
    public Instant getCreatedAt(){return createdAt;} public void setCreatedAt(Instant t){this.createdAt=t;}
}
