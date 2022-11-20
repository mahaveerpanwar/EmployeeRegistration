package com.employeeRegistration.services;

import java.util.List;

import com.employeeRegistration.entities.Employee;

public interface EmployeeService {
	
	public void saveEmpData(Employee employee);

	public List<Employee> findAll();

	public void deleteById(long id);

	public Employee findById(long id);

	public void deleteEmpDataById(Long id);

	
	
}
