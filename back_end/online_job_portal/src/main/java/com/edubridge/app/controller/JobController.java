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

import com.edubridge.app.model.Job;
import com.edubridge.app.service.JobService;

@RestController
@RequestMapping("/api")
public class JobController {
	@Autowired
	private JobService service;

	@PostMapping("/job")
	public ResponseEntity<Job> saveJob(@RequestBody Job job) {
		Job savedJob = service.saveJob(job);
		return new ResponseEntity<>(savedJob, HttpStatus.OK);
	}

	@GetMapping("/job")
	public ResponseEntity<List<Job>> getAllJobs() {
		List<Job> jobs = service.getAllJobs();
		return new ResponseEntity<>(jobs, HttpStatus.OK);
	}

	@GetMapping("/job/{id}")
	public ResponseEntity<Job> getOneJob(@PathVariable("id") Integer id) {
		Job job = service.getJobById(id);
		return new ResponseEntity<>(job, HttpStatus.OK);
	}

	@DeleteMapping("/job/{id}")
	public ResponseEntity<Job> deleteJob(@PathVariable("id") Integer id) {
		service.deleteJobById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/job")
	public ResponseEntity<Job> updateEmployee(@RequestBody Job job) {
		Job j = service.saveJob(job);
		return new ResponseEntity<>(j, HttpStatus.OK);
	}

}