package com.greenfoxacademy.reddit_clone.service;

import com.greenfoxacademy.reddit_clone.model.Post;
import com.greenfoxacademy.reddit_clone.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedditService {

  private RedditRepository redditRepository;

  @Autowired
  RedditService(RedditRepository redditRepository) {
    this.redditRepository = redditRepository;
  }

  public void savePost(Post post) {
    redditRepository.save(post);
  }

}
