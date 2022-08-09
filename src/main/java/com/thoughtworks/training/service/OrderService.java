package com.thoughtworks.training.service;

import com.thoughtworks.training.exception.OrderNotFoundException;
import com.thoughtworks.training.model.entity.Order;
import com.thoughtworks.training.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return orderRepository.save(order);
    }
}
