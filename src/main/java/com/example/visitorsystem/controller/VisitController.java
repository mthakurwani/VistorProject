package com.example.visitorsystem.controller;

import com.example.visitorsystem.model.Visit;
import com.example.visitorsystem.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visit")
public class VisitController {

    @Autowired
    private VisitRepository visitRepository;

    @GetMapping
    public List<Visit> getAllVisits() {
        return visitRepository.findAll();
    }

    @GetMapping("/{id}")
    public Visit getVisitById(@PathVariable long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Visit createVisit(@RequestBody Visit visit) {
        return visitRepository.save(visit);
    }
}
