package com.employeeRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.employeeRegistration.entities.Employee;
import com.employeeRegistration.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeServ;

	@RequestMapping("/app")
	public String login() {
		return "saveEmployeeData";
	}
	
	@PostMapping("/viewCreatePage")
	public String viewCreatePage() {
		return "saveEmployeeData";
	}
	
	@PostMapping("/saveEmpData")
	public String saveEmployeeData(@ModelAttribute() Employee employee){
		
		employeeServ.saveEmpData(employee);
		return "saveEmployeeData";
	}

	hvhjgvh
	
	@GetMapping("/viewEmpData")
	public String viewEmployeeData(Model model) {
		
		List<Employee> findAll = employeeServ.findAll();
		model.addAttribute("findAll", findAll);
		return "viewEmployeeData";
	}
	
	  @RequestMapping(path = "/delete/{id}")
	  public String deleteEmployeeById(@PathVariable("id") long id, Model model) {
		    employeeServ.deleteEmpDataById(id);
		    List<Employee> findAll = employeeServ.findAll();
			model.addAttribute("findAll", findAll);
			return "viewEmployeeData";
	  }
	  
}
