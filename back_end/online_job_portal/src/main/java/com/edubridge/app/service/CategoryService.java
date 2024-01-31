package com.edubridge.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app.dao.CategoryDao;
import com.edubridge.app.model.Category;

@Service
public class CategoryService {
	@Autowired
	private CategoryDao dao;

	public Category saveCategory(Category category) {
		return dao.saveCategory(category);
	}

	public List<Category> getAllCategories() {
		return dao.getAllCategories();
	}

	public Category getCategoryById(int id) {
		return dao.getCategoryById(id);
	}

	public void deleteCategoryById(int id) {
		dao.deleteCategoryById(id);
	}

	public void updateCategoryById(Category category) {
		dao. updateCategoryById(category);
	}
}