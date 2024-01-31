package com.edubridge.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.app.model.Admin;
import com.edubridge.app.service.AdminService;

@RestController
@RequestMapping("/api")
public class AdminController {
	@Autowired
	private AdminService service;
	
	@PostMapping("/admin")
	public ResponseEntity<Admin> saveCategory(@RequestBody Admin admin) {
		Admin savedAdmin = service.saveAdmin(admin);
		return new ResponseEntity<>(savedAdmin, HttpStatus.OK);
	}

	@GetMapping("/admin")
	public ResponseEntity<List<Admin>> getAllAdmins() {
		List<Admin> admins = service.getAllAdmins();
		return new ResponseEntity<>(admins, HttpStatus.OK);
	}

	@GetMapping("/admin/{id}")
	public ResponseEntity<Admin> getOneAdmin(@PathVariable("id") Integer id) {
		Admin admin = service.getAdminById(id);
		return new ResponseEntity<>(admin, HttpStatus.OK);
	}

	@DeleteMapping("/admin/{id}")
	public ResponseEntity<Admin> deleteAdmin(@PathVariable("id") Integer id) {
		service.deleteAdminById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/admin")
	public ResponseEntity<Admin> updateCategory(@RequestBody Admin admin) {
		Admin a = service.saveAdmin(admin);
		return new ResponseEntity<>(a, HttpStatus.OK);
	}


}