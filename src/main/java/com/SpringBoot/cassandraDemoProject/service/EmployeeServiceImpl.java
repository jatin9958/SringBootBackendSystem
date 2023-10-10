package com.SpringBoot.cassandraDemoProject.service;

import com.SpringBoot.cassandraDemoProject.model.EmployeeDTO;
import com.SpringBoot.cassandraDemoProject.model.Employees_table;
import com.SpringBoot.cassandraDemoProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public List<Employees_table> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employees_table getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }


    @Override
    public void saveEmployeeRecord(EmployeeDTO emp) {

        Employees_table newEmp  = new Employees_table();
        newEmp.setEmployee_id(emp.getEmployee_id());
        newEmp.setName(emp.getName());
        newEmp.setSalary(emp.getSalary());
        newEmp.setDepartment(emp.getDepartment());
        newEmp.setEmail(emp.getEmail());
        employeeRepository.save(newEmp);
    }


    @Override
    public void deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
    }


}
