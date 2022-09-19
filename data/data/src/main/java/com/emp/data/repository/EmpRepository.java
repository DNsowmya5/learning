package com.emp.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.emp.data.module.Employee;

@Repository 
public interface EmpRepository extends CrudRepository<Employee, String> {

}
