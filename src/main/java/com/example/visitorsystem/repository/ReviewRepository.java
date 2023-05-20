package com.example.visitorsystem.repository;

import com.example.visitorsystem.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
