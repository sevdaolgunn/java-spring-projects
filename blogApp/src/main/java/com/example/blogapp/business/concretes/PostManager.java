package com.example.blogapp.business.concretes;

import com.example.blogapp.business.abstarct.PostService;
import com.example.blogapp.entity.Category;
import com.example.blogapp.entity.Post;
import com.example.blogapp.repository.CategoryRepository;
import com.example.blogapp.repository.PostRepository;
import com.example.blogapp.request.PostCreateRequest;
import com.example.blogapp.request.PostUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class PostManager implements PostService {
    private final CategoryRepository categoryRepository;
    private final PostRepository postRepository;
    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Post getPost(int id) {
        Optional<Post> post = postRepository.findById(id);

        if (post.isPresent()){
            return post.get();
        }
        return null;
    }

    @Override
    public Post createPost(PostCreateRequest request) {
        Post post = new Post();
        Category category = categoryRepository.findById(request.getCategoryId()).orElse(null);

        if (category != null ){
            post.setCategory(category);
            post.setText(request.getText());
            post.setTitle(request.getTitle());
            post.setImage(request.getImage());
            post.setUploadDate(LocalDate.now());
            return postRepository.save(post);
        }
        return null;
    }

    @Override
    public Post updatePost(int id, PostUpdateRequest request) {
        Optional<Post> foundPost = postRepository.findById(id);
        Optional<Category> foundCategory = categoryRepository.findById(request.getCategoryId());

        if (foundPost.isPresent() && foundCategory.isPresent()){
            Post updatedPost =foundPost.get();
            updatedPost.setCategory(foundCategory.get());
            updatedPost.setTitle(request.getTitle());
            updatedPost.setText(request.getText());
            updatedPost.setUploadDate(LocalDate.now());
            updatedPost.setImage(request.getImage());
        }
        return null;
    }

    @Override
    public void deletePost(int id) {
        Optional<Post> post = postRepository.findById(id);

        if (post.isPresent()){
            postRepository.deleteById(id);
        }

    }

    @Override
    public List<Post> findByCategoryId(int categoryId) {
        return postRepository.findByCategoryId(categoryId);
    }
}
