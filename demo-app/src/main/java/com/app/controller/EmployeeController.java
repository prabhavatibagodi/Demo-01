package com.app.controller;

import com.app.model.Employee;
import com.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;



    @RequestMapping("/hello")
    public List<Employee> getAllDetails(){

        return employeeService.getAllDetails();
    }

    @RequestMapping("/hello/{id}")
    public Employee getEmployeeId(@PathVariable Integer id) {

        return employeeService.getDetails(id);
    }


}
