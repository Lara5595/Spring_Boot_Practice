package com.example.springbootpractice.controllers;

import com.example.springbootpractice.models.Blog;
import com.example.springbootpractice.repositories.BlogsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/blogs")
public class BlogController {

//    Dao for blog repo
    private final BlogsRepository blogDao;
//    Constructor for blogDao
    public BlogController(BlogsRepository blogDao){
        this.blogDao = blogDao;
    }



// This is the main page
    @GetMapping("/blog")
    public String homePage(){
        return "blogs/blog";
    }

//    Login page
    @GetMapping("/loginBlog")
    public String loginPage(){
        return "blogs/loginBlog";
    }


//    This creates the post
    @PostMapping("/blog")
    public String createPost(@RequestParam(name = "title")String title, @RequestParam(name = "body") String body){
        Blog blog = new Blog(title,body);
        blogDao.save(blog);
        return "redirect:/blogs/allBlogs";
    }


//    I am creating the mapping for the allBlogs
    @GetMapping("/allBlogs")
    public String allBlogs(Model model){
        List<Blog> allBlogs = blogDao.findAll();
        model.addAttribute("blogs", allBlogs);
        return "blogs/allBlogs";
    }



}// End of BlogController
