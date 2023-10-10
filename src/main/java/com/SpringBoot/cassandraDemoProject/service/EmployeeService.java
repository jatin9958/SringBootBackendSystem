package com.SpringBoot.cassandraDemoProject.service;

import com.SpringBoot.cassandraDemoProject.model.EmployeeDTO;
import com.SpringBoot.cassandraDemoProject.model.Employees_table;

import java.util.List;


public interface EmployeeService {

    List<Employees_table> getAllEmployees();

    Employees_table getEmployeeById(int id);

    void saveEmployeeRecord(EmployeeDTO emp);

    void deleteEmployeeById(int id);

}
