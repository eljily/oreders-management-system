package com.sidibrahim.oms.service;

import com.sidibrahim.oms.entity.Category;
import com.sidibrahim.oms.repository.CategoryRepository;

public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category fetchCategory(Long id) {
    return categoryRepository.findById(id).orElse(null);
}
}
