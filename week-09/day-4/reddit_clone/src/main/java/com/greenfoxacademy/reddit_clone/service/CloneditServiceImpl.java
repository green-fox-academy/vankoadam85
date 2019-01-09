package com.greenfoxacademy.reddit_clone.service;

import com.greenfoxacademy.reddit_clone.exceptions.ResourceNotFoundException;
import com.greenfoxacademy.reddit_clone.model.Post;
import com.greenfoxacademy.reddit_clone.repository.CommentRepository;
import com.greenfoxacademy.reddit_clone.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CloneditServiceImpl implements CloneditService {

  private PostRepository postRepository;
  private CommentRepository commentRepository;
  private int postPerPage;

  @Autowired
  CloneditServiceImpl(PostRepository postRepository, CommentRepository commentRepository) {
    this.postRepository = postRepository;
    this.commentRepository = commentRepository;
    this.postPerPage = 5;
  }

  public void savePost(Post post) {
    postRepository.save(post);
  }

  public Page<Post> getAllPosts(int page) {
    if (page < 1 || page > this.getNumberOfPages()) {
      throw new ResourceNotFoundException();
    }
    return postRepository.findAllByOrderByScoreDesc(PageRequest.of(page - 1, postPerPage));
  }

  public void upvotePost(long id) {
    Post postToUpvote = this.getPost(id);
    postToUpvote.setScore(postToUpvote.getScore() + 1);
    postRepository.save(postToUpvote);
  }

  public void downvotePost(long id) {
    Post postToDownvote = this.getPost(id);
    postToDownvote.setScore(postToDownvote.getScore() - 1);
    postRepository.save(postToDownvote);
  }

  public Post getPost(long id) {
    return postRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
  }

  public int getNumberOfPages() {
    return (int)Math.ceil(postRepository.count() / (double)postPerPage);
  }

  public int[] getPageNumbers() {
    int[] pageNumbers = new int[this.getNumberOfPages()];
    for (int i = 0; i < this.getNumberOfPages(); i++) {
      pageNumbers[i] = i + 1;
    }
    return pageNumbers;
  }

}
