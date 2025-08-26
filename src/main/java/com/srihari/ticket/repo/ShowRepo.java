package com.srihari.ticket.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.srihari.ticket.entity.Show;
public interface ShowRepo extends JpaRepository<Show, Long> {}
