package com.example.blogapp.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentCreateRequest {
    private String firstName;
    private String lastName;
    private String email;
    private int postId;
    private String comment;

    @Override
    public String toString() {
        return "CommentCreateRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", postId=" + postId + ", comment=" + comment + "]";
    }


}
