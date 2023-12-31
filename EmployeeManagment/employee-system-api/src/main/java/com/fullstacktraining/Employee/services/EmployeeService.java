package com.fullstacktraining.Employee.services;

import com.fullstacktraining.Employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);


    List<Employee> getAllEmployees();

    boolean deleteEmployee(long id);

    Employee getEmployeeById(long id);

    Employee updateEmployee(long id, Employee employee);
}
