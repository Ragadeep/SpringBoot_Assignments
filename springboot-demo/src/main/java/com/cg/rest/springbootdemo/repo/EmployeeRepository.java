package com.cg.rest.springbootdemo.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.cg.rest.springbootdemo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepositoryImplementation<Employee, Integer> {
	
}
