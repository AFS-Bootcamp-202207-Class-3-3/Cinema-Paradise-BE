package com.thoughtworks.training.mapper;

import com.thoughtworks.training.model.dto.MovieResponse;
import com.thoughtworks.training.model.entity.Movie;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {
    public MovieResponse transToMovieResponse(Movie movie) {
        MovieResponse movieResponse = new MovieResponse();
        BeanUtils.copyProperties(movie,movieResponse);
        return movieResponse;
    }
}
