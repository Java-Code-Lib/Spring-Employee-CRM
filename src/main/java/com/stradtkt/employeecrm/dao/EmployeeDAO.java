package com.stradtkt.employeecrm.dao;

import com.stradtkt.employeecrm.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
