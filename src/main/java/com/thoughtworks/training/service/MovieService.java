package com.thoughtworks.training.service;

import com.thoughtworks.training.model.entity.Movie;
import com.thoughtworks.training.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MovieService {

    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        List<Movie> all = movieRepository.findAll();
        return all;
    }

    public Movie getMovieById(String id) {
        return movieRepository.findById(id);
    }

    public String getNewId(){
        return UUID.randomUUID().toString();
    }
}
