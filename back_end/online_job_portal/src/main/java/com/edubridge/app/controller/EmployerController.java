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

import com.edubridge.app.model.Employer;
import com.edubridge.app.service.EmployerService;

@RestController
@RequestMapping("/api")
public class EmployerController {

	@Autowired
	private EmployerService service;

	@PostMapping("/employer")
	public ResponseEntity<Employer> saveEmployer(@RequestBody Employer employer) {
		Employer savedEmployer = service.saveEmployer(employer);
		return new ResponseEntity<>(savedEmployer, HttpStatus.OK);
	}

	@GetMapping("/employer")
	public ResponseEntity<List<Employer>> getAllEmployers() {
		List<Employer> employers = service.getAllEmployers();
		return new ResponseEntity<>(employers, HttpStatus.OK);
	}

	@GetMapping("/employer/{id}")
	public ResponseEntity<Employer> getOneEmployer(@PathVariable("id") Integer id) {
		Employer e = service.getEmployerById(id);
		return new ResponseEntity<>(e, HttpStatus.OK);
	}

	@DeleteMapping("/employer/{id}")
	public ResponseEntity<Employer> deleteEmployer(@PathVariable("id") Integer id) {
		service.deleteEmployerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/employer")
	public ResponseEntity<Employer> updateEmployer(@RequestBody Employer employer) {
		Employer e = service.saveEmployer(employer);
		return new ResponseEntity<>(e, HttpStatus.OK);
	}
}