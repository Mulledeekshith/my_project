package com.edubridge.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app.dao.AdminDao;
import com.edubridge.app.model.Admin;

@Service
public class AdminService {
	@Autowired
	private AdminDao  dao;
	
	public Admin saveAdmin(Admin admin) {
		return dao.saveAdmin(admin);
	}
    
	public List<Admin> getAllAdmins() {
		return dao.getAllAdmins();
	}
	
	public Admin getAdminById(int id) {
		return dao.getAdminById(id);
	}
	
	public void deleteAdminById(int id) {
		dao.deleteAdminById(id);
	}
	
	public void updateAdminById(Admin admin) {
		dao.updateAdminById(admin);
	}
	

}