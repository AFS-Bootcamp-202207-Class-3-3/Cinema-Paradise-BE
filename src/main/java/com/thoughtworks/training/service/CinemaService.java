package com.thoughtworks.training.service;

import com.thoughtworks.training.model.entity.Cinema;
import com.thoughtworks.training.repository.CinemaRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService {

    CinemaRespository cinemaRespository;

    public CinemaService(CinemaRespository cinemaRespository) {
        this.cinemaRespository = cinemaRespository;
    }

    public List<Cinema> findAllCinema() {
        return cinemaRespository.findAll();
    }
}
