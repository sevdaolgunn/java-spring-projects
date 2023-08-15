package com.example.blogapp.controller;

import com.example.blogapp.business.abstarct.CategoryService;
import com.example.blogapp.business.abstarct.PostService;
import com.example.blogapp.entity.Post;
import com.example.blogapp.request.PostCreateRequest;
import com.example.blogapp.request.PostUpdateRequest;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/getAll")
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }
    @GetMapping("/category/{categoryId}")
    public List<Post> getPostsWithCategoryId(@PathVariable int categoryId){
        return postService.findByCategoryId(categoryId);
    }

    @GetMapping("/{postId}")
    public Post getPost(@PathVariable int postId){
        return postService.getPost(postId);
    }

    @PostMapping("/create")
    public Post createPost(@RequestBody PostCreateRequest newPost){
        return postService.createPost(newPost);
    }
    @PutMapping("/{postId}")
    public Post updatePost(@RequestBody PostUpdateRequest updatedPost, @PathVariable int postId){
        return postService.updatePost(postId, updatedPost);
    }

    @DeleteMapping("/{postId}")
    public void deletePost(@PathVariable int postId){
        postService.deletePost(postId);
    }
}
