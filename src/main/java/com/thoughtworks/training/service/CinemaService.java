package com.thoughtworks.training.service;

import com.thoughtworks.training.exception.CinemaNotFoundException;
import com.thoughtworks.training.model.entity.Cinema;
import com.thoughtworks.training.repository.CinemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService {

    CinemaRepository cinemaRepository;

    public CinemaService(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    public List<Cinema> findAllCinema() {
        return cinemaRepository.findAll();
    }

    public Cinema findById(String id){
        return cinemaRepository.findById(id)
                .orElseThrow(CinemaNotFoundException::new);
    }
}
