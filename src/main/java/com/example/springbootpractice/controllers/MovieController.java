package com.example.springbootpractice.controllers;

import com.example.springbootpractice.models.Movies;
import com.example.springbootpractice.repositories.MoviesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class MovieController {

    private final MoviesRepository postDao;

    public MovieController(MoviesRepository postDao){
        this.postDao = postDao;
    }




    @GetMapping("/movies")
    public String homePage(){
        return "posts/movies";
    }



    //    Creates new post
    @PostMapping("/movies")
//    This is the one that sends you to the all-post
    public  String createPost(@RequestParam(name = "genre") String genre, @RequestParam(name = "title") String title){
        Movies post = new Movies(title,genre);
        postDao.save(post);
        return "redirect:/posts/allMovies";
    }

    //
    @GetMapping("/allMovies")
    public String allPostsBlog(Model model){
        List<Movies> allMovies = postDao.findAll();
        model.addAttribute("movies", allMovies);
        return "posts/allMovies";
    }

}


