package com.srihari.ticket.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name="bookings")
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional=false) private User user;
    @ManyToOne(optional=false) private Show showEntity;
    private int seats;
    private Instant createdAt = Instant.now();
    private boolean cancelled=false;

    // getters/setters
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public User getUser(){return user;} public void setUser(User u){this.user=u;}
    public Show getShowEntity(){return showEntity;} public void setShowEntity(Show s){this.showEntity=s;}
    public int getSeats(){return seats;} public void setSeats(int s){this.seats=s;}
    public Instant getCreatedAt(){return createdAt;} public void setCreatedAt(Instant t){this.createdAt=t;}
    public boolean isCancelled(){return cancelled;} public void setCancelled(boolean c){this.cancelled=c;}
}
