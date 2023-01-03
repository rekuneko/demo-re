package com.example.demo.service;

import com.example.demo.model.BudgetRequest;
import com.example.demo.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetRequestServiceImpl implements BudgetRequestService {

    @Autowired
    private BudgetRepository budgetRepository;

    @Override
    public List<BudgetRequest> findAll() {
        return budgetRepository.findAll();
    }

    @Override
    public BudgetRequest findById(int id) {
        return budgetRepository.findById(id).orElse(null);
    }

    @Override
    public BudgetRequest save(BudgetRequest budgetRequest) {
        return budgetRepository.save(budgetRequest);
    }

    @Override
    public void delete(int id) {
        budgetRepository.deleteById(id);
    }
}
