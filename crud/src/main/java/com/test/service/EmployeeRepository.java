package com.test.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
