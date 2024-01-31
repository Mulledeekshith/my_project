package com.edubridge.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.app.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}