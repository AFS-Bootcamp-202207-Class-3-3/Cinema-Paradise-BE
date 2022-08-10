package com.thoughtworks.training.controller;


import com.thoughtworks.training.mapper.ArrangementMapper;
import com.thoughtworks.training.model.dto.ArrangementResponse;
import com.thoughtworks.training.service.ArrangementService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/arrangements")
@CrossOrigin
public class ArrangementController {

    private final ArrangementMapper arrangementMapper;
    private final ArrangementService arrangementService;

    public ArrangementController(ArrangementMapper arrangementMapper, ArrangementService arrangementService) {
        this.arrangementMapper = arrangementMapper;
        this.arrangementService = arrangementService;
    }

    @GetMapping
    public List<ArrangementResponse> findAll(){
        return arrangementService.findAll().stream()
                .map(arrangementMapper::transToResponse)
                .collect(Collectors.toList());
    }


}
