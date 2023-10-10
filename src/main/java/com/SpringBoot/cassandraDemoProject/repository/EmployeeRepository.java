package com.SpringBoot.cassandraDemoProject.repository;

import com.SpringBoot.cassandraDemoProject.model.Employees_table;
import org.springframework.data.cassandra.repository.CassandraRepository;




public interface EmployeeRepository extends CassandraRepository<Employees_table, Integer> {


}
