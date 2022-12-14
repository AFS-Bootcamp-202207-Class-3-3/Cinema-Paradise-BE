package com.thoughtworks.training.repository;


import com.thoughtworks.training.model.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
    Movie findByTitleChinese(String chineseName);
}
