package com.example.blogapp.controller;

import com.example.blogapp.business.abstarct.CategoryService;
import com.example.blogapp.business.concretes.CategoryManager;
import com.example.blogapp.entity.Category;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories")

public class CategoryController {
    private final CategoryService categoryService;
    @GetMapping("/getAll")
    public List<Category> getAllPost(){
        return categoryService.getAllCategory();
    }
    @GetMapping("/{categoryId}")
    public Category getPost(@PathVariable int categoryId){
        return categoryService.getCategory(categoryId);
    }

    @PostMapping("/create")
    public Category createCategory(@RequestBody Category newCategory){
        return categoryService.createCategory(newCategory);
    }

    @PutMapping("/{categoryId}")
    public Category updateCategory(@PathVariable int postId, @RequestBody Category updatedCategory){
        return categoryService.updateCategory(postId, updatedCategory);

    }

    @DeleteMapping("/{categoryId}")
    public void deletePost(@PathVariable int categoryId){
        categoryService.deleteCategory(categoryId);
    }
}
