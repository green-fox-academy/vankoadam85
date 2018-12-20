package com.greenfoxacademy.reddit_clone.service;

import com.greenfoxacademy.reddit_clone.model.Post;
import com.greenfoxacademy.reddit_clone.repository.CloneditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CloneditService {

  private CloneditRepository cloneditRepository;

  @Autowired
  CloneditService(CloneditRepository cloneditRepository) {
    this.cloneditRepository = cloneditRepository;
  }

  public void savePost(Post post) {
    cloneditRepository.save(post);
  }

  public ArrayList<Post> getAllPosts() {
    return (ArrayList<Post>) cloneditRepository.findAll();
  }

}
