package com.greenfoxacademy.reddit_clone.controller;

import com.greenfoxacademy.reddit_clone.model.Post;
import com.greenfoxacademy.reddit_clone.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RedditController {

  private RedditService redditService;

  @Autowired
  RedditController(RedditService redditService) {
    this.redditService = redditService;
  }

  @GetMapping("/new_post")
  public String createNewPost(@ModelAttribute("newPost") Post post) {
    return "newPost";
  }

  @PostMapping("/new_post")
  public String saveNewPost(Post post) {
    redditService.savePost(post);
    return "redirect:/";
  }

}
