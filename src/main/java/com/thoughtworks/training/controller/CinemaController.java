package com.thoughtworks.training.controller;

import com.thoughtworks.training.mapper.CinemaMapper;
import com.thoughtworks.training.model.dto.CinemaRequest;
import com.thoughtworks.training.model.dto.CinemaResponse;
import com.thoughtworks.training.model.entity.Cinema;
import com.thoughtworks.training.service.CinemaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CinemaResponse createNewCinema(@RequestBody CinemaRequest cinemaRequest){
        Cinema cinema = cinemaMapper.transToEntity(cinemaRequest);
        return cinemaMapper.transToResponse(cinemaService.createNewCinema(cinema));
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable String id){
        cinemaService.deleteById(id);
    }

}
