package com.thoughtworks.training.mapper;


import com.thoughtworks.training.model.dto.ArrangementResponse;
import com.thoughtworks.training.model.entity.Arrangement;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ArrangementMapper {
    public ArrangementResponse transToResponse(Arrangement arrangement) {
        ArrangementResponse arrangementResponse = new ArrangementResponse();
        BeanUtils.copyProperties(arrangement,arrangementResponse);
        arrangementResponse.setCinemaId(arrangement.getCinemaArrange().getId());
        arrangementResponse.setMovieId(arrangement.getMovieArrange().getId());
        arrangementResponse.setArrangeDate(arrangement.getArrangeDate().toString());
        arrangementResponse.setTime(arrangement.getTime().toString());
        return arrangementResponse;
    }
}
