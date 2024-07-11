package com.example.budget_planner.web.controller;

import com.example.budget_planner.business.service.ExpenseService;
import com.example.budget_planner.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
    public class ExpenseController {
        @Autowired
        private ExpenseService expenseService;

        @PostMapping
        public Expense save(@RequestBody Expense expense) {
            return expenseService.save(expense);
        }

        @GetMapping("/budget/{budgetId}")
        public List<Expense> findByBudgetId(@PathVariable Long budgetId) {
            return expenseService.findByBudgetId(budgetId);
        }
    }
