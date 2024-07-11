package com.example.budget_planner.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expenseId;

    private String description;
    private Double amount;

    @ManyToOne
    @JoinColumn(name = "budget_id")
    private Budget budget;

    public void setBudget(Budget budget) {
    }
}
