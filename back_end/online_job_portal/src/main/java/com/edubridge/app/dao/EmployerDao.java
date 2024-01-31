package com.edubridge.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.app.model.Employee;
import com.edubridge.app.model.Employer;
import com.edubridge.app.repo.EmployerRepository;

@Repository
public class EmployerDao {
	@Autowired
	private EmployerRepository repo;
	
	public Employer saveEmployer(Employer employer) {
		return repo.save(employer);
	}
    
	public List<Employer> getAllEmployers() {
		return repo.findAll();
	}
	
	public Employer getEmployerById(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteEmployerById(int id) {
		repo.deleteById(id);
	}
	
	public void updateEmployerById(Employer employer) {
		repo.save(employer);
	}

}