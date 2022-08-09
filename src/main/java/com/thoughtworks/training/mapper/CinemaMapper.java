package com.thoughtworks.training.mapper;

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
}
