package com.thoughtworks.training.controller;

import com.thoughtworks.training.mapper.OrderMapper;
import com.thoughtworks.training.model.dto.OrderRequest;
import com.thoughtworks.training.model.dto.OrderResponse;
import com.thoughtworks.training.model.entity.Order;
import com.thoughtworks.training.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {

    private final OrderService orderService;
    private final OrderMapper orderMapper;

    public OrderController(OrderService orderService, OrderMapper orderMapper) {
        this.orderService = orderService;
        this.orderMapper = orderMapper;
    }

    @GetMapping
    public List<OrderResponse> findAll(){
        return orderService.findAll().stream()
                .map(orderMapper::transToResponse)
                .collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}")
    public OrderResponse findOrderById(@PathVariable String id){
        return orderMapper.transToResponse(orderService.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderResponse insertNewOrder(@RequestBody OrderRequest orderRequest){
        Order order = orderMapper.transToEntity(orderRequest);
        return orderMapper.transToResponse(orderService.insertNewOrder(order));
    }

}