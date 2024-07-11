package com.example.budget_planner.model;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity

public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long budgetId;

    private String name;
    private Double totalAmount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "budget")
    private List<Expense> expenses;

    public void setUser(User user) {
    }
}
