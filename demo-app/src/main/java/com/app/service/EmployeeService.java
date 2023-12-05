package com.app.service;

import com.app.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {


    List<Employee> empList = Arrays.asList(
            new Employee(100,"abc","abc description"),
            new Employee(101,"xyz","xyz description"),
            new Employee(102,"mnp","mnp description")
    );
    public List<Employee> getAllDetails() {
        return empList;
    }
    public Employee getDetails(Integer id) {


        return  empList.stream().filter(e->e.getId().equals(id)).findFirst().get();
    }


}
