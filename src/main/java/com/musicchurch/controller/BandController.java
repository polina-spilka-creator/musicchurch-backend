package com.musicchurch.controller;

import com.musicchurch.model.Band;
import com.musicchurch.service.BandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BandController {
    private BandService bandService;

    public BandController(BandService bandService) {
        this.bandService = bandService;
    }

    @PostMapping("/bands")
    public Band craeteBand(@RequestParam String name ) {
        return bandService.createBand(name);
    }

}
