package com.edubridge.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.app.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	

}