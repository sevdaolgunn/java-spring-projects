package com.example.blogapp.business.abstarct;

import com.example.blogapp.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();
    Category getCategory(int id);
    Category createCategory(Category category);
    Category updateCategory(int id, Category category);
    void deleteCategory(int id);


}
