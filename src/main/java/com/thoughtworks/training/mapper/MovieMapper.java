package com.thoughtworks.training.mapper;

import com.thoughtworks.training.model.dto.MovieRequest;
import com.thoughtworks.training.model.dto.MovieResponse;
import com.thoughtworks.training.model.entity.Movie;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class MovieMapper {
    public MovieResponse transToMovieResponse(Movie movie) {
        MovieResponse movieResponse = new MovieResponse();
        BeanUtils.copyProperties(movie,movieResponse);
        movieResponse.setReleaseDate(movie.getReleaseDate().toString());
        return movieResponse;
    }

    public Movie transToEntity(MovieRequest movieRequest) {
        Movie movie = new Movie();
        BeanUtils.copyProperties(movieRequest,movie);
        movie.setReleaseDate(Date.valueOf(movieRequest.getReleaseDate()));
        return movie;
    }
}
