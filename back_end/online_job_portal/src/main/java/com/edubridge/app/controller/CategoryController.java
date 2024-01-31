package com.edubridge.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.app.model.Category;
import com.edubridge.app.service.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {
	@Autowired
	private CategoryService service;

	@PostMapping("/category")
	public ResponseEntity<Category> saveCategory(@RequestBody Category category) {
		Category savedCategory = service.saveCategory(category);
		return new ResponseEntity<>(savedCategory, HttpStatus.OK);
	}

	@GetMapping("/category")
	public ResponseEntity<List<Category>> getAllCategories() {
		List<Category> categories = service.getAllCategories();
		return new ResponseEntity<>(categories, HttpStatus.OK);
	}

	@GetMapping("/category/{id}")
	public ResponseEntity<Category> getOneCategory(@PathVariable("id") Integer id) {
		Category category = service.getCategoryById(id);
		return new ResponseEntity<>(category, HttpStatus.OK);
	}

	@DeleteMapping("/category/{id}")
	public ResponseEntity<Category> deleteCategory(@PathVariable("id") Integer id) {
		service.deleteCategoryById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/category")
	public ResponseEntity<Category> updateCategory(@RequestBody Category category) {
		Category c = service.saveCategory(category);
		return new ResponseEntity<>(c, HttpStatus.OK);
	}

}