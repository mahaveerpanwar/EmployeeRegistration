package com.employeeRegistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeRegistration.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
	
}
