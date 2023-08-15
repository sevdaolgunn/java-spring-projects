package com.example.blogapp.business.abstarct;

import com.example.blogapp.entity.Post;
import com.example.blogapp.request.PostCreateRequest;
import com.example.blogapp.request.PostUpdateRequest;

import java.util.List;

public interface PostService {
    List<Post> getAllPost();
    Post getPost(int id);
    Post createPost(PostCreateRequest request);
    Post updatePost(int id, PostUpdateRequest request);
    void deletePost(int id);
    List<Post> findByCategoryId(int categoryId);
}
