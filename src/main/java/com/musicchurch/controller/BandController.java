package com.musicchurch.controller;

import com.musicchurch.model.Band;
import com.musicchurch.service.BandService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class BandController {
    private BandService bandService;

    public BandController(BandService bandService) {
        this.bandService = bandService;
    }

    @PostMapping("/bands")
    public Band createBand(@RequestParam String name, @RequestParam String genre) {
        return bandService.createBand(name, genre);
    }

    @GetMapping("/bands/{id}")
    public Band getBand(@PathVariable Integer id) {
        return bandService.getBand(id);
    }


}
