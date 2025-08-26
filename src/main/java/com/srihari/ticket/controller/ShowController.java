package com.srihari.ticket.controller;

import org.springframework.web.bind.annotation.*;
import com.srihari.ticket.entity.Show;
import com.srihari.ticket.repo.ShowRepo;
import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowController {
    private final ShowRepo repo;
    public ShowController(ShowRepo repo){ this.repo = repo; }

    @GetMapping public List<Show> all(){ return repo.findAll(); }
    @PostMapping public Show create(@RequestBody Show s){ s.setBooked(0); return repo.save(s); }
}
