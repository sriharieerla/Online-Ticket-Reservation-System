package com.srihari.ticket.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.srihari.ticket.entity.Booking;
public interface BookingRepo extends JpaRepository<Booking, Long> {}
