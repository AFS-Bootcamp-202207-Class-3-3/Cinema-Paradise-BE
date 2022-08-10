package com.thoughtworks.training.mapper;

import com.thoughtworks.training.model.dto.CinemaRequest;
import com.thoughtworks.training.model.dto.CinemaResponse;
import com.thoughtworks.training.model.entity.Cinema;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CinemaMapper {
    public CinemaResponse transToResponse(Cinema cinema) {
        CinemaResponse cinemaResponse = new CinemaResponse();
        BeanUtils.copyProperties(cinema, cinemaResponse);
        return cinemaResponse;
    }

    public Cinema transToEntity(CinemaRequest cinemaRequest) {
        Cinema cinema = new Cinema();
        BeanUtils.copyProperties(cinemaRequest, cinema);
        return cinema;
    }
}
