package com.srihari.ticket.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="shows")
public class Show {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String venue;
    private LocalDateTime startTime;
    private int capacity;
    private int booked;
    // getters/setters
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getTitle(){return title;} public void setTitle(String t){this.title=t;}
    public String getVenue(){return venue;} public void setVenue(String v){this.venue=v;}
    public LocalDateTime getStartTime(){return startTime;} public void setStartTime(LocalDateTime t){this.startTime=t;}
    public int getCapacity(){return capacity;} public void setCapacity(int c){this.capacity=c;}
    public int getBooked(){return booked;} public void setBooked(int b){this.booked=b;}
}
