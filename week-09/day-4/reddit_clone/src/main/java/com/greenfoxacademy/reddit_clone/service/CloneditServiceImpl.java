package com.greenfoxacademy.reddit_clone.service;

import com.greenfoxacademy.reddit_clone.exceptions.PostNotFoundException;
import com.greenfoxacademy.reddit_clone.model.Post;
import com.greenfoxacademy.reddit_clone.repository.CloneditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CloneditServiceImpl implements CloneditService {

  private CloneditRepository cloneditRepository;

  @Autowired
  CloneditServiceImpl(CloneditRepository cloneditRepository) {
    this.cloneditRepository = cloneditRepository;
  }

  public void savePost(Post post) {
    cloneditRepository.save(post);
  }

  public ArrayList<Post> getAllPosts() {
    return cloneditRepository.findAllByOrderByScoreDesc();
  }

  public void upvotePost(long id) {
    Post postToUpvote = this.getPost(id);
    postToUpvote.increaseScore();
    cloneditRepository.save(postToUpvote);
  }

  public void downvotePost(long id) {
    Post postToDownvote = this.getPost(id);
    postToDownvote.decreaseScore();
    cloneditRepository.save(postToDownvote);
  }

  public Post getPost(long id) {
    return cloneditRepository.findById(id).orElseThrow(PostNotFoundException::new);
  }

}