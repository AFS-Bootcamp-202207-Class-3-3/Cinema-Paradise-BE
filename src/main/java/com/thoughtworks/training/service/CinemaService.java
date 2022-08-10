package com.thoughtworks.training.service;

import com.thoughtworks.training.exception.CinemaNotFoundException;
import com.thoughtworks.training.model.entity.Cinema;
import com.thoughtworks.training.repository.CinemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

    public Cinema createNewCinema(Cinema cinema) {
        cinema.setId(getNewId());
        return cinemaRepository.save(cinema);
    }

    private String getNewId(){
        return UUID.randomUUID().toString();
    }


    public void deleteById(String id){
        if (cinemaRepository.existsById(id)){
            cinemaRepository.deleteById(id);
        }
    }
}
