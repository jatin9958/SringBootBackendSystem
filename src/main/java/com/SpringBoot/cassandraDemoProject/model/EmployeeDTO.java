package com.SpringBoot.cassandraDemoProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @NotNull
    private int employee_id;
    @NotNull
    private String name;
    @NotEmpty
    private String department;
    @Email
    private String email;

    private BigDecimal salary;


}