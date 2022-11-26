package com.example.springbootpractice.controllers;

import com.example.springbootpractice.repositories.BlogsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blogs")
public class BlogController {

//    Dao for blogrepo
    private final BlogsRepository blogDao;
//    Constructor for blogDao
    public BlogController(BlogsRepository blogDao){
        this.blogDao = blogDao;
    }


    @GetMapping("/blog")
    public String homePage(){
        return "blogs/blog";
    }






}// End of BlogController
