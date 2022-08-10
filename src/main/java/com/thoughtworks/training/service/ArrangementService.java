package com.thoughtworks.training.service;

import com.thoughtworks.training.model.entity.Arrangement;
import com.thoughtworks.training.repository.ArrangementRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArrangementService {

    ArrangementRepository arrangementRepository;

    public ArrangementService(ArrangementRepository arrangementRepository) {
        this.arrangementRepository = arrangementRepository;
    }

    public List<Arrangement> findAll() {

        return arrangementRepository.findAll().stream()
                .filter(arrangement -> arrangement.getArrangeDate().toLocalDate().isAfter(LocalDate.now().plusDays(-1)))
                .filter(arrangement -> arrangement.getArrangeDate().toLocalDate().isBefore(LocalDate.now().plusDays(5)))
                .filter(arrangement -> arrangement.getTime().toLocalTime().isAfter(LocalTime.now()))
                .collect(Collectors.toList());
    }



}
