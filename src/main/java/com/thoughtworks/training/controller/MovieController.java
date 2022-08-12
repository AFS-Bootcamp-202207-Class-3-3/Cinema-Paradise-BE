package com.thoughtworks.training.controller;

import com.thoughtworks.training.mapper.MovieMapper;
import com.thoughtworks.training.model.dto.request.MovieRequest;
import com.thoughtworks.training.model.dto.response.MovieResponse;
import com.thoughtworks.training.model.entity.Movie;
import com.thoughtworks.training.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/movies")
@CrossOrigin
public class MovieController {

    private final MovieService movieService;
    private final MovieMapper movieMapper;

    public MovieController(MovieService movieService, MovieMapper movieMapper) {
        this.movieService = movieService;
        this.movieMapper = movieMapper;
    }

    @GetMapping
    public List<MovieResponse> getAllMovies(){
        return movieService.getAllMovies()
                .stream()
                .map(movieMapper::transToMovieResponse)
                .collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}")
    public MovieResponse getMovieById(@PathVariable String id){
        return movieMapper.transToMovieResponse(movieService.getMovieById(id));
    }

    @GetMapping(path = "movie/{chineseName}")
    public MovieResponse getMovieByChineseName(@PathVariable String chineseName){
        return movieMapper.transToMovieResponse(movieService.getMovieByChineseName(chineseName));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MovieResponse insertNewMovie(@RequestBody MovieRequest movieRequest){
        Movie movie = movieMapper.transToEntity(movieRequest);
        return movieMapper.transToMovieResponse(movieService.insertNewMovie(movie));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        movieService.deleteById(id);
    }
}
