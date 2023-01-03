package com.example.demo.repository;


import com.example.demo.model.BudgetRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<BudgetRequest, Integer> {
}
