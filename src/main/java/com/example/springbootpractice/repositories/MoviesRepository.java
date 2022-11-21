package com.example.springbootpractice.repositories;

import com.example.springbootpractice.models.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies, Long> {
}
