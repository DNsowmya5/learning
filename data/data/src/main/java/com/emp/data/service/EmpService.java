package com.emp.data.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.data.module.Employee;
import com.emp.data.repository.EmpRepository;
@Service
public class EmpService {
@Autowired
EmpRepository emprepository;

	public List<Employee> getAllEmp() {
	
	List<Employee> employees=new ArrayList<>();
	emprepository.findAll().forEach(employees::add);
	return employees;
	}
	
	public Employee getEmp(String employeeId) {
		
		return emprepository.findById(employeeId).get();
	}

	public void addEmp(Employee employee) {
		emprepository.save(employee);
	}

	public void updateEmp(Employee employee, String id) {
	emprepository.save(employee);
		
	}

	public void deleteEmp(String id) {
	emprepository.deleteById(id);
		
	}
	
	
	

}
