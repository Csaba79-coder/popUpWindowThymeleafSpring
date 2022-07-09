package com.example.popupwindowthymeleafspring;

import com.example.popupwindowthymeleafspring.model.Employee;
import com.example.popupwindowthymeleafspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PopUpWindowThymeleafSpringApplication implements ApplicationRunner {

    private final EmployeeService employeeService;

    @Autowired
    public PopUpWindowThymeleafSpringApplication(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(PopUpWindowThymeleafSpringApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        var csaba = new Employee("Csaba", "Vadasz", "Java Software Development", 2022);
        employeeService.saveEmployee(csaba);
        var ibolya = new Employee("Ibolya", "Jurinka", "Software Development", 2020);
        employeeService.saveEmployee(ibolya);
        var anett = new Employee("Anett", "Lökösházy", "Software Development", 2021);
        employeeService.saveEmployee(anett);
        var marcella = new Employee("Marcella", "Markovits", "Java Software Development", 2000);
        employeeService.saveEmployee(marcella);
    }
}
