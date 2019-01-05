package com.greenfoxacademy.reddit_clone.service;

import com.greenfoxacademy.reddit_clone.exceptions.PostNotFoundException;
import com.greenfoxacademy.reddit_clone.model.Post;
import com.greenfoxacademy.reddit_clone.repository.CloneditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.OptionalInt;

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

  public Page<Post> getAllPosts(int page) {
    return cloneditRepository.findAllByOrderByScoreDesc(PageRequest.of(page - 1, 2));
  }

  public void upvotePost(long id) {
    Post postToUpvote = this.getPost(id);
    postToUpvote.setScore(postToUpvote.getScore() + 1);
    cloneditRepository.save(postToUpvote);
  }

  public void downvotePost(long id) {
    Post postToDownvote = this.getPost(id);
    postToDownvote.setScore(postToDownvote.getScore() - 1);
    cloneditRepository.save(postToDownvote);
  }

  public Post getPost(long id) {
    return cloneditRepository.findById(id).orElseThrow(PostNotFoundException::new);
  }

}
