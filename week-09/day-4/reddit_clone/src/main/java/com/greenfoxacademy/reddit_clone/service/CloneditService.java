package com.greenfoxacademy.reddit_clone.service;

import com.greenfoxacademy.reddit_clone.model.Post;

import java.util.ArrayList;

public interface CloneditService {

  void savePost(Post post);

  ArrayList<Post> getAllPosts();

  void upvotePost(long id);

  void downvotePost(long id);

  Post getPost(long id);

}
