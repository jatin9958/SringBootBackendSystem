package com.SpringBoot.cassandraDemoProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;


import javax.persistence.Table;
import java.math.BigDecimal;


@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employees_table {

    @PrimaryKey
    private int employee_id;
    private String name;
    private String department;
    private String email;
    private BigDecimal salary;
}
