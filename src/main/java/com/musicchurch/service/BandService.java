package com.musicchurch.service;

import com.musicchurch.model.Band;
import com.musicchurch.repository.BandRepository;
import org.springframework.stereotype.Service;

@Service
public class BandService {

    private final BandRepository bandRepository;

    public BandService(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }

    public Band createBand(String name) {
        Band band = new Band(name);
        return bandRepository.save(band);
    }

    public Band createBand(String name, String genre) {
        Band band = new Band(name, genre);
        return bandRepository.save(band);
    }

    public Band getBand(Integer id) {

        return bandRepository.getById(id);
    }

}
