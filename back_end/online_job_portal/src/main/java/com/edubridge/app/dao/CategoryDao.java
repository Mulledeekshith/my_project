package com.edubridge.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.app.model.Category;
import com.edubridge.app.repo.CategoryRepository;

@Repository
public class CategoryDao {
	@Autowired
	private CategoryRepository repo;
	
	public Category saveCategory(Category category) {
		return repo.save(category);
	}
    
	public List<Category> getAllCategories() {
		return repo.findAll();
	}
	
	public Category getCategoryById(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteCategoryById(int id) {
		repo.deleteById(id);
	}
	
	public void updateCategoryById(Category category) {
		repo.save(category);
	}
}