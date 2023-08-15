package com.example.blogapp.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostCreateRequest {

    private String title;
    private String text;
    private String image;
    private int categoryId;

}
