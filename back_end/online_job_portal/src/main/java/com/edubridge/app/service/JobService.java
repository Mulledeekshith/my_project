package com.edubridge.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app.dao.JobDao;
import com.edubridge.app.model.Job;

@Service
public class JobService {
	@Autowired
	private JobDao dao;

	public Job saveJob(Job job) {
		return dao.saveJob(job);
	}

	public List<Job> getAllJobs() {
		return dao.getAllJobs();
	}

	public Job getJobById(int id) {
		return dao.getJobById(id);
	}

	public void deleteJobById(int id) {
		dao.deleteJobById(id);
	}

	public void updateJobById(Job job) {
		dao.updateJobById(job);
	}

}