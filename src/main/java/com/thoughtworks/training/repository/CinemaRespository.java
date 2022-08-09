package com.thoughtworks.training.repository;

import com.thoughtworks.training.model.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRespository extends JpaRepository<Cinema, String> {
}
