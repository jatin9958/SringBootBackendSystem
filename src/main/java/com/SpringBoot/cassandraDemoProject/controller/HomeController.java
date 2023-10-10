package com.SpringBoot.cassandraDemoProject.controller;

import com.SpringBoot.cassandraDemoProject.model.EmployeeDTO;
import com.SpringBoot.cassandraDemoProject.model.Employees_table;
import com.SpringBoot.cassandraDemoProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/employee/")
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("all")
    public List<Employees_table> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employees_table getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public void saveEmployeeRecord(@Valid @RequestBody EmployeeDTO emp) {
        employeeService.saveEmployeeRecord(emp);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable int id) {
           employeeService.deleteEmployeeById(id);
    }


}
