package com.example.budget_planner.web.controller;
import com.example.budget_planner.business.persistence.DTO.UserBudgetExpensesDTO;
import com.example.budget_planner.business.service.BudgetService;
import com.example.budget_planner.business.service.ExpenseService;
import com.example.budget_planner.business.service.UserService;
import com.example.budget_planner.model.Budget;
import com.example.budget_planner.model.Expense;
import com.example.budget_planner.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private BudgetService budgetService;

    @Autowired
    private ExpenseService expenseService;


    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/{username}")
    public User findByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }


    @PostMapping("/createWithBudgetAndExpenses")
    public User createUserWithBudgetAndExpenses(@RequestBody UserBudgetExpensesDTO userBudgetExpensesDTO) {

        User user = userService.save(userBudgetExpensesDTO.getUser());

        Budget budget = userBudgetExpensesDTO.getBudget();
        budget.setUser(user);
        budget = budgetService.save(budget);

        for (Expense expense : userBudgetExpensesDTO.getExpenses()) {
            expense.setBudget(budget);
            expenseService.save(expense);
        }

        return user;
    }
}
