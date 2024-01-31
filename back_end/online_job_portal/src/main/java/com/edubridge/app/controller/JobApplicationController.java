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

import com.edubridge.app.model.JobApplication;
import com.edubridge.app.service.JobApplicationService;

@RestController
@RequestMapping("/api")
public class JobApplicationController {
	@Autowired
	private JobApplicationService service;

	@PostMapping("/jobApplication")
	public ResponseEntity<JobApplication> saveJobApplication(@RequestBody JobApplication jobApplication) {
		JobApplication savedJobApplication = service.saveJobApplication(jobApplication);
		return new ResponseEntity<>(savedJobApplication, HttpStatus.OK);
	}

	@GetMapping("/jobApplication")
	public ResponseEntity<List<JobApplication>> getAllJobApplications() {
		List<JobApplication> jobApplications = service.getAllJobApplications();
		return new ResponseEntity<>(jobApplications, HttpStatus.OK);
	}

	@GetMapping("/jobApplication/{id}")
	public ResponseEntity<JobApplication> getOneJobApplication(@PathVariable("id") Long id) {
		JobApplication jobApplication = service.getJobApplicationById(id);
		return new ResponseEntity<>(jobApplication, HttpStatus.OK);
	}

	@DeleteMapping("/jobApplication/{id}")
	public ResponseEntity<JobApplication> deleteJobApplication(@PathVariable("id") Long id) {
		service.deleteJobApplicationById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/jobApplication")
	public ResponseEntity<JobApplication> updateJobApplication(@RequestBody JobApplication jobApplication) {
		JobApplication jobapply = service.saveJobApplication(jobApplication);
		return new ResponseEntity<>(jobapply, HttpStatus.OK);
	}

}