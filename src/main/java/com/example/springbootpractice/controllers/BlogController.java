package com.example.springbootpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blogs")
public class BlogController {

    @GetMapping("/blog")
    public String homePage(){
        return "blogs/blog";
    }






}// End of BlogController
