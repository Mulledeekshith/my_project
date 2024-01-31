package com.edubridge.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.app.model.Employer;

public interface EmployerRepository extends JpaRepository<Employer, Integer> {

}