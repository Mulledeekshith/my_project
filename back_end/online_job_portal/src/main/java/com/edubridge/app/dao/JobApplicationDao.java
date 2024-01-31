package com.edubridge.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.app.model.JobApplication;
import com.edubridge.app.repo.JobApplicationRepository;

@Repository
public class JobApplicationDao {
	@Autowired
	private JobApplicationRepository repo;
	public JobApplication saveJobApplication(JobApplication jobApplication) {
		return repo.save(jobApplication);
	}
    
	public List<JobApplication> getAllJobApplications() {
		return repo.findAll();
	}
	
	public JobApplication getJobApplicationById(Long id) {
		return repo.findById(id).get();
	}
	
	public void deleteJobApplicationById(Long id) {
		repo.deleteById(id);
	}
	
	public void updateJobApplicationById(JobApplication jobApplication) {
		repo.save(jobApplication);
	}

}