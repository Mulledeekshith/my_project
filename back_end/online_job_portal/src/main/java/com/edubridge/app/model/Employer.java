package com.edubridge.app.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name ="employer")
public class Employer {
	
	@Id
	@GeneratedValue
	private Integer employerId;
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
	@OneToMany(cascade = CascadeType.ALL,
			fetch = FetchType.LAZY)
private Set<Job> jobs;

	public Employer() {
		super();
	}

}