package com.example.budget_planner.business.service;

import com.example.budget_planner.business.persistence.BudgetRepository;
import com.example.budget_planner.model.Budget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {
    @Autowired
    private BudgetRepository budgetRepository;

    public Budget save(Budget budget) {
        return budgetRepository.save(budget);
    }

    public List<Budget> findByUserId(Long userId) {
        return budgetRepository.findByUserId(userId);
    }
}
