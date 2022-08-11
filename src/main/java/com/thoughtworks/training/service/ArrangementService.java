package com.thoughtworks.training.service;

import com.thoughtworks.training.model.entity.Arrangement;
import com.thoughtworks.training.repository.ArrangementRepository;
import org.springframework.stereotype.Service;
import java.time.*;
import java.util.ArrayList;
import java.util.Comparator;
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

        List<Arrangement> arrangements = arrangementRepository.findByMovieAndCinemaId(movieId, cinemaId).stream()
                .filter(arrangement -> arrangement.getArrangeDate().toLocalDate().isAfter(LocalDate.now().plusDays(-1)))
                .filter(arrangement -> arrangement.getArrangeDate().toLocalDate().isBefore(LocalDate.now().plusDays(5)))
                .sorted(Comparator.comparing(Arrangement::getTime))
                .collect(Collectors.toList());

        for (Arrangement arrangement : arrangements) {
            if (arrangement.getArrangeDate().toLocalDate().equals(LocalDate.now())){
                if (arrangement.getTime().toLocalTime().isAfter(LocalTime.now())){
                    returnArrangements.add(arrangement);
                }
            }else {
                returnArrangements.add(arrangement);
            }
        }

        return returnArrangements;
    }

    public Arrangement findById(String id){
        return arrangementRepository.findById(id)
                .orElseThrow(ArrayIndexOutOfBoundsException::new);
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
