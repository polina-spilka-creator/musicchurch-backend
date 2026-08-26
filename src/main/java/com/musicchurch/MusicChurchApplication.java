package com.musicchurch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan("com.musicchurch.model")
public class MusicChurchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicChurchApplication.class, args);
    }

}
