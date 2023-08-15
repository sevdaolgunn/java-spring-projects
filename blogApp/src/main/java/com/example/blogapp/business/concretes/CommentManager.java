package com.example.blogapp.business.concretes;

import com.example.blogapp.business.abstarct.CommentService;
import com.example.blogapp.entity.Comment;
import com.example.blogapp.entity.Post;
import com.example.blogapp.repository.CommentRepository;
import com.example.blogapp.repository.PostRepository;
import com.example.blogapp.request.CommentCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentManager implements CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    @Override
    public List<Comment> gelAllComment() {
        return commentRepository.findAll();
    }

    @Override
    public List<Comment> getCommentWithPostId(int postId) {
        return null;
    }

    @Override
    public Comment getComment(int id) {
        Optional<Comment> comment = commentRepository.findById(id);
        if (comment.isPresent()){
            return comment.get();
        }
        return null;
    }

    @Override
    public Comment createComment(CommentCreateRequest request) {

        System.out.println(request);
        Optional<Post> foundPost = postRepository.findById(request.getPostId());
        if (foundPost.isPresent()){
            Comment newComment = new Comment();
            newComment.setPost(foundPost.get());
            newComment.setFirstName(request.getFirstName());
            newComment.setLastname(request.getLastName());
            newComment.setEmail(request.getEmail());
            newComment.setComment(request.getComment());
            return commentRepository.save(newComment);
        }
        return null;
    }

    @Override
    public Comment updateComment(int id, Comment comment) {
        return null;
    }

    @Override
    public void deleteComment(int id) {
        if (commentRepository.findById(id).isPresent()){
            commentRepository.deleteById(id);
        }

    }
}
