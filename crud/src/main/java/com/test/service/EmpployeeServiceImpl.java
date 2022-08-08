package com.test.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Employee;

@Service

public class EmpployeeServiceImpl implements EmployeeService {
	
    @Autowired
    EmployeeRepository employeeRepository;
    
	@Override
	@Transactional
	public Employee saveEmployee(Employee e) {
		
		return employeeRepository.save(e);
	}

	@Override
	@Transactional
	public Employee getEmployee(long empId) {
		Optional<Employee> emp = employeeRepository.findById(Long.valueOf(empId));
		if(emp.isEmpty())
		{
			return null;
		}
		return emp.get();
	}

	@Override
	@Transactional
	public Boolean deleteEmployee(long empId) {
	 employeeRepository.deleteById(empId);
		return true;
	
	}

	@Override
	@Transactional
	public Employee updateEmployee(Employee e) {
		 
		return employeeRepository.save(e);
	}

}
