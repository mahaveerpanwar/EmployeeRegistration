package com.employeeRegistration.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeRegistration.entities.Employee;
import com.employeeRegistration.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	
	@Override
	public void saveEmpData(Employee employee) {
		employeeRepo.save(employee);
	}


	@Override
	public List<Employee> findAll() {
		
		List<Employee> findAll = employeeRepo.findAll();
		return findAll;
	}


	@Override
	public void deleteById(long id) {
			
		employeeRepo.deleteById(id);
		
	}


	@Override
	public Employee findById(long id) {
		
		Optional<Employee> findById = employeeRepo.findById(id);
		Employee employee = findById.get();
		return employee;
		
	}


	@Override
	public void deleteEmpDataById(Long id) {
		
		employeeRepo.deleteById(id);
		
	}

}
