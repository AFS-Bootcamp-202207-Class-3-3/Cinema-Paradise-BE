package com.thoughtworks.training.mapper;

import com.thoughtworks.training.model.dto.OrderRequest;
import com.thoughtworks.training.model.dto.OrderResponse;
import com.thoughtworks.training.model.entity.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {
    public OrderResponse transToResponse(Order order) {
        OrderResponse orderResponse = new OrderResponse();
        BeanUtils.copyProperties(order,orderResponse);
        orderResponse.setMovie_title(order.getMovie().getTitlechinese());
        orderResponse.setCinema_name(order.getCinema().getName());
        orderResponse.setDate(order.getDate().toString());
        orderResponse.setTime(order.getTime().toString());
        return orderResponse;
    }

    public Order transToEntity(OrderRequest orderRequest) {
        Order order = new Order();
        BeanUtils.copyProperties(orderRequest,order);
        return order;
    }
}
