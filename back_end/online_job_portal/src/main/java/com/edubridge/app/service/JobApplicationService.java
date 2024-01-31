package com.edubridge.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app.dao.JobApplicationDao;
import com.edubridge.app.model.JobApplication;

@Service
public class JobApplicationService {
	@Autowired
	private JobApplicationDao dao;
	
	public JobApplication saveJobApplication(JobApplication jobApplication) {
		return dao.saveJobApplication(jobApplication);
	}
    
	public List<JobApplication> getAllJobApplications() {
		return dao.getAllJobApplications();
	}
	
	public JobApplication getJobApplicationById(Long id) {
		return dao.getJobApplicationById(id);
	}
	
	public void deleteJobApplicationById(Long id) {
		dao.deleteJobApplicationById(id);
	}
	
	public void updateJobApplicationById(JobApplication jobApplication) {
		dao.updateJobApplicationById(jobApplication);
	}
	
	

}