package com.thoughtworks.training.service;

import com.thoughtworks.training.model.entity.Arrangement;
import com.thoughtworks.training.repository.ArrangementRepository;
import org.springframework.stereotype.Service;
import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ArrangementService {

    ArrangementRepository arrangementRepository;

    public ArrangementService(ArrangementRepository arrangementRepository) {
        this.arrangementRepository = arrangementRepository;
    }

    public List<Arrangement> findByMovieAndCinemaId(String movieId, String cinemaId) {
        List<Arrangement> returnArrangements = new ArrayList<>();

        return arrangementRepository.findByMovieAndCinemaId(movieId, cinemaId).stream()
                .filter(arrangement -> arrangement.getArrangeDate().toLocalDate().isAfter(LocalDate.now().plusDays(-1)) && arrangement.getTime().toLocalTime().isAfter(LocalTime.now()))
                .filter(arrangement -> arrangement.getArrangeDate().toLocalDate().isBefore(LocalDate.now().plusDays(5)))
                .collect(Collectors.toList());

//        for (Arrangement arrangement : arrangements) {
//            if (arrangement.getArrangeDate().toLocalDate().equals(LocalDate.now())){
//                if (arrangement.getTime().toLocalTime().isAfter(LocalTime.now())){
//                    returnArrangements.add(arrangement);
//                }
//            }else {
//                returnArrangements.add(arrangement);
//            }
//        }
//        return returnArrangements;
    }


    public Arrangement createNewArrangement(Arrangement arrangement) {
        arrangement.setId(getNewId());
        return arrangementRepository.save(arrangement);
    }

    public String getNewId() {
        return UUID.randomUUID().toString();
    }

    public void deleteById(String id) {
        if (arrangementRepository.existsById(id)) {
            arrangementRepository.deleteById(id);
        }
    }
}
