package com.thoughtworks.training.mapper;


import com.thoughtworks.training.model.dto.ArrangementRequest;
import com.thoughtworks.training.model.dto.ArrangementResponse;
import com.thoughtworks.training.model.entity.Arrangement;
import com.thoughtworks.training.service.ArrangementService;
import com.thoughtworks.training.service.CinemaService;
import com.thoughtworks.training.service.MovieService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Time;

@Component
public class ArrangementMapper {

    @Autowired
    MovieService movieService;
    @Autowired
    CinemaService cinemaService;

    public ArrangementResponse transToResponse(Arrangement arrangement) {
        ArrangementResponse arrangementResponse = new ArrangementResponse();
        BeanUtils.copyProperties(arrangement,arrangementResponse);
        arrangementResponse.setCinemaId(arrangement.getCinemaArrange().getId());
        arrangementResponse.setMovieId(arrangement.getMovieArrange().getId());
        arrangementResponse.setArrangeDate(arrangement.getArrangeDate().toString());
        arrangementResponse.setTime(arrangement.getTime().toString());
        return arrangementResponse;
    }

    public Arrangement transToEntity(ArrangementRequest arrangementRequest) {
        Arrangement arrangement = new Arrangement();
        BeanUtils.copyProperties(arrangementRequest,arrangement);

        arrangement.setMovieArrange(movieService.getMovieById(arrangementRequest.getMovieId()));
        arrangement.setCinemaArrange(cinemaService.findById(arrangementRequest.getCinemaId()));
        arrangement.setArrangeDate(Date.valueOf(arrangementRequest.getArrangeDate()));
        arrangement.setTime(Time.valueOf(arrangementRequest.getTime()));

        return arrangement;
    }
}
