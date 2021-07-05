package com.example.restfuldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restfuldemo.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}