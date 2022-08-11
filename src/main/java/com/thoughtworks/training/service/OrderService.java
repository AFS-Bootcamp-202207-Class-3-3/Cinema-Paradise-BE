package com.thoughtworks.training.service;

import com.thoughtworks.training.exception.OrderNotFoundException;
import com.thoughtworks.training.model.entity.Order;
import com.thoughtworks.training.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(String id) {
        return orderRepository.findById(id)
                .orElseThrow(OrderNotFoundException::new);
    }

    public Order insertNewOrder(Order order) {
        order.setId(getNewId());
        return orderRepository.save(order);
    }

    public String getNewId(){
        return UUID.randomUUID().toString();
    }

    public void deleteById(String id) {
        if(orderRepository.existsById(id)){
            orderRepository.deleteById(id);
        }
    }

    public List<Order> findOrdersByArrangementId(String id) {
        return orderRepository.findMovieOrdersByArrangementId(id);
    }
}
