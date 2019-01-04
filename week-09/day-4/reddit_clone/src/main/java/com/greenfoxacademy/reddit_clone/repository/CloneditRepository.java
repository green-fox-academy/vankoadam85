package com.greenfoxacademy.reddit_clone.repository;

import com.greenfoxacademy.reddit_clone.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CloneditRepository extends CrudRepository<Post, Long> {

  ArrayList<Post> findAllByOrderByScoreDesc();

}
