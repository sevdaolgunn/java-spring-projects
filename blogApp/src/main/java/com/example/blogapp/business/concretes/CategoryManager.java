package com.example.blogapp.business.concretes;

import com.example.blogapp.business.abstarct.CategoryService;
import com.example.blogapp.entity.Category;
import com.example.blogapp.repository.CategoryRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryManager implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategory(int id) {
        return null;
    }

    @Override
    public Category createCategory(Category category) {//??
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(int id, Category category) {
        Category tempCategory = categoryRepository.findById(id).orElse(null);
        if (tempCategory!=null){
            tempCategory.setName(category.getName());
            return categoryRepository.save(tempCategory);
        }
        return null;
    }

    @Override
    public void deleteCategory(int id) {
        if (categoryRepository.findById(id).isPresent()){
            categoryRepository.deleteById(id);
        }

    }
}
