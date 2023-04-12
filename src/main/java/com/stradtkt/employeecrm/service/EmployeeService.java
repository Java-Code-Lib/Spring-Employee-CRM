package com.stradtkt.employeecrm.service;

import com.stradtkt.employeecrm.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
