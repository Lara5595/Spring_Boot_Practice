package com.example.springbootpractice.repositories;

import com.example.springbootpractice.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogsRepository extends JpaRepository<Blog, Long> {

}
