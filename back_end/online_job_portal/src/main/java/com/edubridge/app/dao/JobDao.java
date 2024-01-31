package com.edubridge.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.app.model.Job;
import com.edubridge.app.repo.JobRepository;

@Repository
public class JobDao {
	@Autowired
	private JobRepository repo;
	
	public Job saveJob(Job job) {
		return repo.save(job);
	}
    
	public List<Job> getAllJobs() {
		return repo.findAll();
	}
	
	public Job getJobById(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteJobById(int id) {
		repo.deleteById(id);
	}
	
	public void updateJobById(Job job) {
		repo.save(job);
	}

}