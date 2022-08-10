package com.thoughtworks.training.mapper;

import com.thoughtworks.training.model.dto.OrderRequest;
import com.thoughtworks.training.model.dto.OrderResponse;
import com.thoughtworks.training.model.entity.Order;
import com.thoughtworks.training.service.CinemaService;
import com.thoughtworks.training.service.MovieService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Time;

@Component
public class OrderMapper {

    @Autowired
    MovieService movieService;
    @Autowired
    CinemaService cinemaService;

    public OrderResponse transToResponse(Order order) {
        OrderResponse orderResponse = new OrderResponse();
        BeanUtils.copyProperties(order,orderResponse);
        orderResponse.setMovieTitle(order.getMovie().getTitleChinese());
        orderResponse.setCinemaName(order.getCinema().getName());
        orderResponse.setDate(order.getDate().toString());
        orderResponse.setTime(order.getTime().toString());
        return orderResponse;
    }

    public Order transToEntity(OrderRequest orderRequest) {
        Order order = new Order();
        BeanUtils.copyProperties(orderRequest,order);
        order.setMovie(movieService.getMovieById(orderRequest.getMovieId()));
        order.setCinema(cinemaService.findById(orderRequest.getCinemaId()));
        order.setDate(Date.valueOf(orderRequest.getDate()));
        order.setTime(Time.valueOf(orderRequest.getTime()));
        return order;
    }
}
