package com.example.budget_planner.business.persistence.DTO;

import com.example.budget_planner.model.Budget;
import com.example.budget_planner.model.Expense;
import com.example.budget_planner.model.User;

import java.util.List;

public class UserBudgetExpensesDTO {
    private User user;
    private Budget budget;
    private List<Expense> expenses;
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }
}
