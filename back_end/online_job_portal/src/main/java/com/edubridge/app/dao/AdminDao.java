package com.edubridge.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.app.model.Admin;
import com.edubridge.app.repo.AdminRepository;

@Repository
public class AdminDao {
	@Autowired
	private AdminRepository repo;
	
	public Admin saveAdmin(Admin admin) {
		return repo.save(admin);
	}
    
	public List<Admin> getAllAdmins() {
		return repo.findAll();
	}
	
	public Admin getAdminById(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteAdminById(int id) {
		repo.deleteById(id);
	}
	
	public void updateAdminById(Admin admin) {
		repo.save(admin);
	}
	
	

}