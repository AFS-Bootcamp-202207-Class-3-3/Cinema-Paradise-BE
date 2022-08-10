package com.thoughtworks.training.repository;


import com.thoughtworks.training.model.entity.Arrangement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArrangementRepository extends JpaRepository<Arrangement, String> {
    @Query(nativeQuery=true, value ="select * from arrangement where movie_id = :movieId and cinema_id = :cinemaId")
    List<Arrangement> findByMovieAndCinemaId(@Param("movieId") String movieId,@Param("cinemaId") String cinemaId);
}
