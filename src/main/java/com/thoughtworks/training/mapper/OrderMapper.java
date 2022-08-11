package com.thoughtworks.training.mapper;

import com.thoughtworks.training.model.dto.OrderRequest;
import com.thoughtworks.training.model.dto.OrderResponse;
import com.thoughtworks.training.model.entity.Order;
import com.thoughtworks.training.service.ArrangementService;
import com.thoughtworks.training.service.CinemaService;
import com.thoughtworks.training.service.MovieService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderMapper {

    @Autowired
    MovieService movieService;
    @Autowired
    CinemaService cinemaService;
    @Autowired
    ArrangementService arrangementService;

    public OrderResponse transToResponse(Order order) {
        OrderResponse orderResponse = new OrderResponse();
        BeanUtils.copyProperties(order, orderResponse);
        orderResponse.setMovieTitle(order.getMovie().getTitleChinese());
        orderResponse.setCinemaName(order.getCinema().getName());
        orderResponse.setDate(order.getDate().toString());
        orderResponse.setTime(order.getTime().toString());
        return orderResponse;
    }

    public Order transToEntity(OrderRequest orderRequest) {
        Order order = new Order();
        BeanUtils.copyProperties(orderRequest, order);
        order.setMovie(movieService.getMovieById(orderRequest.getMovieId()));
        order.setCinema(cinemaService.findById(orderRequest.getCinemaId()));
        order.setArrangement(arrangementService.findById(orderRequest.getArrangementId()));
        String dateString = transToDateString(orderRequest.getDate());
        order.setDate(Date.valueOf(dateString));
        order.setTime(Time.valueOf(orderRequest.getTime()));
        return order;
    }

    public String transToDateString(String date) {
        return LocalDate.now().getYear() + "-"
                + date.substring(0, date.indexOf('月')) + "-"
                + date.substring(date.indexOf('月')+1, date.indexOf('日'));
    }

    public List<String> transToChooseResponse(List<Order> ordersByArrangementId) {
        return ordersByArrangementId.stream()
                .map(Order::getSeat)
                .collect(Collectors.toList());
    }
}
