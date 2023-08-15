package com.example.blogapp.controller;

import com.example.blogapp.business.abstarct.CommentService;
import com.example.blogapp.entity.Comment;
import com.example.blogapp.request.CommentCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentService commentService;

    @GetMapping("/")
    public List<Comment> getAllComment(){
        return commentService.gelAllComment();
    }

    @GetMapping("/{commentId}")
    public Comment getComment(@PathVariable int commentId){
        return commentService.getComment(commentId);
    }
    @GetMapping("/post/{postId}")
    public List<Comment> getCommentsWithPostId(@PathVariable int postId){
        return commentService.getCommentWithPostId(postId);
    }

    @PostMapping("/create")
    public Comment createComment(@RequestBody CommentCreateRequest newComment){
        return commentService.createComment(newComment);
    }

    @DeleteMapping("/{commentId}")
    public void deleteComment(@PathVariable int commentId){
        commentService.deleteComment(commentId);

    }
}
