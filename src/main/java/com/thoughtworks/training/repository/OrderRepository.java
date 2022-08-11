package com.thoughtworks.training.repository;

import com.thoughtworks.training.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
    List<Order> findMovieOrdersByArrangementId(String id);
}
