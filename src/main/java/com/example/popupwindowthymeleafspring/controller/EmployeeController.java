package com.example.popupwindowthymeleafspring.controller;

import com.example.popupwindowthymeleafspring.model.Employee;
import com.example.popupwindowthymeleafspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public String renderEmployees(Model model) {
        model.addAttribute("employees", employeeService.findAllEmployee());
        return "employee";
    }

    @GetMapping("/employees/create")
    public String renderBuildings(Model model) {
        return "create-employee";
    }

    @PostMapping("/employees/create")
    public String createEmployee(Employee employee, Model model) {
        var newEmployee = employeeService.saveEmployee(employee);
        if (employee == null) {
            model.addAttribute("error", "This employee already exist.");
            return "employee";
        } else {
            return "redirect:/employees";
        }
    }
}
