package com.example.demo.service;

import com.example.demo.model.BudgetRequest;

import java.util.List;

public interface BudgetRequestService {

    List<BudgetRequest> findAll();
    BudgetRequest findById(int id);
    BudgetRequest save(BudgetRequest budgetRequest);
    void delete(int id);
}
