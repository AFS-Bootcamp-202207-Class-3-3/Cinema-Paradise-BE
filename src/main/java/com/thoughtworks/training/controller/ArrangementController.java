package com.thoughtworks.training.controller;


import com.thoughtworks.training.mapper.ArrangementMapper;
import com.thoughtworks.training.model.dto.ArrangementRequest;
import com.thoughtworks.training.model.dto.ArrangementResponse;
import com.thoughtworks.training.model.entity.Arrangement;
import com.thoughtworks.training.service.ArrangementService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ArrangementResponse createNewArrangement(@RequestBody ArrangementRequest arrangementRequest){
        Arrangement arrangement = arrangementMapper.transToEntity(arrangementRequest);
        return arrangementMapper.transToResponse(arrangementService.createNewArrangement(arrangement));

    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable String id){
        arrangementService.deleteById(id);
    }


}
