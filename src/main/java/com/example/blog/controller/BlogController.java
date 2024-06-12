package com.example.blog.controller;


import com.example.blog.domain.UserInfo;
import com.example.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("api")
public class BlogController {

    @Autowired
    private BlogService blogService;



}
