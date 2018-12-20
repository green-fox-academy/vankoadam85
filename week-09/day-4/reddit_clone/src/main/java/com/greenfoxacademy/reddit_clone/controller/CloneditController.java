package com.greenfoxacademy.reddit_clone.controller;

import com.greenfoxacademy.reddit_clone.model.Post;
import com.greenfoxacademy.reddit_clone.service.CloneditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CloneditController {

  private CloneditService cloneditService;

  @Autowired
  CloneditController(CloneditService cloneditService) {
    this.cloneditService = cloneditService;
  }

  @RequestMapping("/")
  public String listPosts(Model model) {
    model.addAttribute("posts", cloneditService.getAllPosts());
    return "list_posts";
  }

  @GetMapping("/new_post")
  public String createNewPost(@ModelAttribute("newPost") Post post) {
    return "newPost";
  }

  @PostMapping("/new_post")
  public String saveNewPost(Post post) {
    cloneditService.savePost(post);
    return "redirect:/";
  }

  @GetMapping("/upvote/{id}")
  public String upvote(@PathVariable("id") long id) {
    cloneditService.upvotePost(id);
    return "redirect:/";
  }

  @GetMapping("downvote/{id}")
  public String downvote(@PathVariable("id") long id) {
    cloneditService.downvotePost(id);
    return "redirect:/";
  }

}
