package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;





@RestController
@RequestMapping("/employee")
public class EmployeeController {
@GetMapping("/getEmployee")
public List<Employee> getEmployee() {
    Employee e1=new Employee("employee1","e1@mail.com","developer");
    Employee e2=new Employee("employee 2","e2@mail.com","tester");
    List<Employee> employees=new ArrayList<>();
    employees.add(e1);
    employees.add(e2);
    return employees;
}
@GetMapping("/home")
public String home() {
    return new String("Employee home page");
}

}
