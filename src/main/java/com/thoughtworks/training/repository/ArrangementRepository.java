package com.thoughtworks.training.repository;


import com.thoughtworks.training.model.entity.Arrangement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArrangementRepository extends JpaRepository<Arrangement, String> {
}
