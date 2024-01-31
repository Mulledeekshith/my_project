package com.edubridge.app.model;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Table(name ="job_category")
public class Category {
	@Id
	@GeneratedValue
	private Integer categoryId;
	private String jobCategory;

	//@OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
	//private Set<Job> jobs;
	 
	public Category() {
		super();
	}

}