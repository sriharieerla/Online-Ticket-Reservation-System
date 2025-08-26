package com.srihari.ticket.controller;

import org.springframework.web.bind.annotation.*;
import com.srihari.ticket.entity.Booking;
import com.srihari.ticket.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private final BookingService service;
    public BookingController(BookingService service){ this.service = service; }

    @PostMapping("/book")
    public Booking book(@RequestParam Long userId, @RequestParam Long showId, @RequestParam int seats){
        return service.book(userId, showId, seats);
    }

    @PostMapping("/{id}/cancel")
    public Booking cancel(@PathVariable Long id){
        return service.cancel(id);
    }
}
