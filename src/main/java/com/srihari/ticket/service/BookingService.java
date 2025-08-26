package com.srihari.ticket.service;

import com.srihari.ticket.entity.*;
import com.srihari.ticket.repo.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookingService {
    private final BookingRepo bookingRepo;
    private final UserRepo userRepo;
    private final ShowRepo showRepo;

    public BookingService(BookingRepo bookingRepo, UserRepo userRepo, ShowRepo showRepo){
        this.bookingRepo = bookingRepo; this.userRepo = userRepo; this.showRepo = showRepo;
    }

    @Transactional
    public Booking book(Long userId, Long showId, int seats){
        User user = userRepo.findById(userId).orElseThrow();
        Show show = showRepo.findById(showId).orElseThrow();
        if (show.getBooked() + seats > show.getCapacity()) throw new RuntimeException("Not enough seats");
        show.setBooked(show.getBooked() + seats);
        Booking b = new Booking();
        b.setUser(user); b.setShowEntity(show); b.setSeats(seats);
        return bookingRepo.save(b);
    }

    @Transactional
    public Booking cancel(Long bookingId){
        Booking b = bookingRepo.findById(bookingId).orElseThrow();
        if(b.isCancelled()) return b;
        Show show = b.getShowEntity();
        show.setBooked(Math.max(0, show.getBooked() - b.getSeats()));
        b.setCancelled(true);
        return b;
    }
}
