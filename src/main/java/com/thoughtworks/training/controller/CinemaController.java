package com.thoughtworks.training.controller;

import com.thoughtworks.training.mapper.CinemaMapper;
import com.thoughtworks.training.model.dto.CinemaResponse;
import com.thoughtworks.training.service.CinemaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cinemas")
@CrossOrigin
public class CinemaController {

    private final CinemaMapper cinemaMapper;
    private final CinemaService cinemaService;

    public CinemaController(CinemaMapper cinemaMapper, CinemaService cinemaService) {
        this.cinemaMapper = cinemaMapper;
        this.cinemaService = cinemaService;
    }

    @GetMapping
    public List<CinemaResponse> findAllCinema() {
        return cinemaService.findAllCinema().stream()
                .map(cinemaMapper::transToResponse)
                .collect(Collectors.toList());
    }
}
