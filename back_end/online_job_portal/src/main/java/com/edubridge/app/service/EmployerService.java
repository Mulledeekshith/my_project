package com.edubridge.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app.dao.EmployerDao;
import com.edubridge.app.model.Employer;

@Service
public class EmployerService {
	@Autowired
	private EmployerDao dao;
	public Employer saveEmployer(Employer employer) {
		return dao.saveEmployer(employer);
	}
    
	public List<Employer> getAllEmployers() {
		return dao.getAllEmployers();
	}
	
	public Employer getEmployerById(int id) {
		return dao.getEmployerById(id);
	}
	
	public void deleteEmployerById(int id) {
		dao.deleteEmployerById(id);
	}
	
	public void updateEmployerById(Employer employer) {
		dao.updateEmployerById(employer);
	}

}