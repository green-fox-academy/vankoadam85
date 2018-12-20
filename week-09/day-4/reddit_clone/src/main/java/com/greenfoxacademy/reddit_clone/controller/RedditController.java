package com.greenfoxacademy.reddit_clone.controller;

import com.greenfoxacademy.reddit_clone.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class RedditController {

  @GetMapping("/new_post")
  public String createNewPost(@ModelAttribute("newPost") Post post) {
    return "newPost";
  }

}
