package com.example.popupwindowthymeleafspring.service;

import com.example.popupwindowthymeleafspring.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> findAllEmployee();
    Employee saveEmployee(Employee employee);
}
