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

  public void upvotePost(long id) {
    Post postToUpvote = cloneditRepository.findById(id).get();
    postToUpvote.increaseScore();
    cloneditRepository.save(postToUpvote);
  }

  public void downvotePost(long id) {
    Post postToDownvote = cloneditRepository.findById(id).get();
    postToDownvote.decreaseScore();
    cloneditRepository.save(postToDownvote);
  }

  public Post getPost(long id) {
    return cloneditRepository.findById(id).get();
  }

}
