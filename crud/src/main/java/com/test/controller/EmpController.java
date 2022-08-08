package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Employee;
import com.test.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmpController {
	@Autowired
	EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@GetMapping("/{empId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("empId") Long empId) {
		Employee employee = employeeService.getEmployee(empId);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		
		
		
	}

}
