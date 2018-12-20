package com.greenfoxacademy.reddit_clone.repository;

import com.greenfoxacademy.reddit_clone.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface RedditRepository extends CrudRepository<Post, Long> {


}
