package com.edubridge.app.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Employee875")
public class Employee {

	@Id
	@GeneratedValue
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private Long contactNo;
	private String street;
	private String city;
	private String state;
	private Integer pincode;
	private String country;
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private Set<JobApplication> jobApplications=new HashSet<>();

}