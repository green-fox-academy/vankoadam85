package com.greenfoxacademy.reddit_clone.service;

import com.greenfoxacademy.reddit_clone.model.Comment;
import com.greenfoxacademy.reddit_clone.model.Post;
import org.springframework.data.domain.Page;

public interface CloneditService {

  void savePost(Post post);

  Page<Post> getAllPosts(int page);

  void upvotePost(long id);

  void downvotePost(long id);

  Post getPost(long id);

  int getNumberOfPages();

  int[] getPageNumbers();

  void saveComment(Comment comment, long id);

  Iterable<Comment> getAllCommentsOfPost(long id);

}
