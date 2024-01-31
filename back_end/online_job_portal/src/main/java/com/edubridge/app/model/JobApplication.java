package com.edubridge.app.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="job_applications")
public class JobApplication {

	@Id
	@GeneratedValue
	private Long applicationId;
	
	 @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	 
	@JoinColumn(name="employeeId")
	//@JoinColumn(name = "employeeLastName")
	private Employee employee;
	
	@ManyToOne(cascade = CascadeType.MERGE,
			fetch = FetchType.LAZY)
	@JoinColumn(name="jobId")
	//@JoinColumn(name="companyName")
	private Job job;
	
	
}