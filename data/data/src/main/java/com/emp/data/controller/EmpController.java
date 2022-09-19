package com.emp.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.data.module.Employee;
import com.emp.data.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService empservice;
	
	@GetMapping("/coin")
	public List<Employee> getAllEmp() {
		return empservice.getAllEmp();
	}
	
	@GetMapping("/coin/{id}")
	public Employee getEmp(@PathVariable String id) {
		return empservice.getEmp(id);
		
	}
	
	@PostMapping("/coin")
	public void addEmp(@RequestBody Employee employee) {
		empservice.addEmp(employee);	
		
	}
	
	@PutMapping("/coin/{id}")
	public void updateEmp(@RequestBody Employee employee, @PathVariable String id) {
		empservice.updateEmp(employee, id);
	}
	
	@DeleteMapping("/coin/{id}")
	public void deleteEmp(@PathVariable String id) {
		empservice.deleteEmp(id);
		
	}
	

}
