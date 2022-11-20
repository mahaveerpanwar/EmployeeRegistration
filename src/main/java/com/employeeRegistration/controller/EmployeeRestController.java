package com.employeeRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeRegistration.entities.Employee;
import com.employeeRegistration.repositories.EmployeeRepository;

@RestController
@RequestMapping("/api/employee")
public class EmployeeRestController {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@GetMapping
	public List<Employee> getAllEmployeeData(){
		
		List<Employee> employee = employeeRepo.findAll();
		return employee;
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmpDataById(@PathVariable("id") long id){
		employeeRepo.deleteById(id);
	}
	
	@PostMapping
	public void saveEmployeeData(@RequestBody Employee employee) {
		employeeRepo.save(employee);
	}
	
}
