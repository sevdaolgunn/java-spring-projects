package com.example.blogapp.business.abstarct;

import com.example.blogapp.entity.Comment;
import com.example.blogapp.request.CommentCreateRequest;

import java.util.List;

public interface CommentService {
    List<Comment> gelAllComment();
    List<Comment> getCommentWithPostId(int postId);
    Comment getComment(int id);
    Comment createComment(CommentCreateRequest request);
    Comment updateComment(int id, Comment comment);
    void deleteComment(int id);
}
