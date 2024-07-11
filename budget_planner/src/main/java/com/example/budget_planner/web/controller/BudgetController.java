package com.example.budget_planner.web.controller;

import com.example.budget_planner.business.service.BudgetService;
import com.example.budget_planner.model.Budget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/budgets")
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @PostMapping
    public Budget save(@RequestBody Budget budget) {
        return budgetService.save(budget);
    }

    @GetMapping("/user/{userId}")
    public List<Budget> findByUserId(@PathVariable Long userId) {
        return budgetService.findByUserId(userId);
    }
}
