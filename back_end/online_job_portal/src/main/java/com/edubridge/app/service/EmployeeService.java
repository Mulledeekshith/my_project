package com.edubridge.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app.dao.EmployeeDao;
import com.edubridge.app.model.Employee;

@Service
public class EmployeeService {
      @Autowired
	private EmployeeDao dao;
	
	public Employee saveEmployee(Employee employee) {
		return dao.saveEmployee(employee);
	}
    
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}
	
	public Employee getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}
	
	public void deleteEmployeeById(int id) {
		dao.deleteEmployeeById(id);
	}
	
	public void updateEmployeeById(Employee employee) {
		dao.updateEmployeeById(employee);
	}
}