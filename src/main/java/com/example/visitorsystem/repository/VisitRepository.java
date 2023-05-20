package com.example.visitorsystem.repository;

import com.example.visitorsystem.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Long> {
}
