package com.fgm.springdatarest.employee.repos;

import org.springframework.data.repository.CrudRepository;

import com.fgm.springdatarest.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	

}
