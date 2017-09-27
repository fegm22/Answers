package com.fgm.springdatarest.department.repos;

import org.springframework.data.repository.CrudRepository;

import com.fgm.springdatarest.department.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

	
}
