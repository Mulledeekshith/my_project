package com.edubridge.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.app.model.Employee;
import com.edubridge.app.repo.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	private EmployeeRepository repo;

	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}
    
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteEmployeeById(int id) {
		repo.deleteById(id);
	}
	
	public void updateEmployeeById(Employee employee) {
		repo.save(employee);
	}
	

}