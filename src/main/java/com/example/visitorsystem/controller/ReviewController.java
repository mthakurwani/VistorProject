package com.example.visitorsystem.controller;

import com.example.visitorsystem.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")

    public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;
}
