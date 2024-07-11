package com.example.budget_planner.business.service;
import com.example.budget_planner.business.persistence.ExpenseRepository;
import com.example.budget_planner.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense save(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> findByBudgetId(Long budgetId) {
        return expenseRepository.findByBudgetId(budgetId);
    }
}
