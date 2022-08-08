package com.test.service;

import com.test.model.Employee;

public interface EmployeeService {
        public Employee saveEmployee(Employee e);
        
        public Employee getEmployee(long empId);
        
        public Boolean deleteEmployee(long empId);
        
        public Employee updateEmployee(Employee e);
}
