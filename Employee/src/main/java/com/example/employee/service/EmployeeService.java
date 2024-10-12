package com.example.employee.service;

import java.util.List;

import com.example.employee.model.Employee;

public interface EmployeeService {
	
	List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Integer id);
    void deleteEmployeeById(Integer id);

}
