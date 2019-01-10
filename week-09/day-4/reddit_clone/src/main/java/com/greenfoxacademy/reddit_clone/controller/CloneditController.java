package com.greenfoxacademy.reddit_clone.controller;

import com.greenfoxacademy.reddit_clone.model.Comment;
import com.greenfoxacademy.reddit_clone.model.Post;
import com.greenfoxacademy.reddit_clone.service.CloneditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CloneditController {

  private CloneditService cloneditService;

  @Autowired
  CloneditController(CloneditService cloneditService) {
    this.cloneditService = cloneditService;
  }

  @GetMapping({"/", ""})
  public String listPosts(@RequestParam(value = "pg", required = false) Integer page, Model model) {
    Optional<Integer> pageNumber = Optional.ofNullable(page);
    model.addAttribute("posts", cloneditService.getAllPosts(pageNumber.orElse(1)));
    model.addAttribute("current_page", pageNumber.orElse(1));
    model.addAttribute("page_numbers", cloneditService.getPageNumbers());
    model.addAttribute("last_page", cloneditService.getNumberOfPages());
    return "list_posts";
  }

  @GetMapping("/new_post")
  public String createNewPost(Model model) {
    model.addAttribute("newPost", new Post());
    return "new_post";
  }

  @PostMapping("/new_post")
  public String saveNewPost(Post post) {
    cloneditService.savePost(post);
    return "redirect:/";
  }

  @PostMapping("/{id}/upvote")
  public String upvote(@PathVariable("id") long id, int currentPage) {
    cloneditService.upvotePost(id);
    return "redirect:/?pg=" + currentPage;
  }

  @PostMapping("/{id}/downvote")
  public String downvote(@PathVariable("id") long id, int currentPage) {
    cloneditService.downvotePost(id);
    return "redirect:/?pg=" + currentPage;
  }

  @GetMapping("/{id}/details")
  public String getPostDetails(@PathVariable("id") long id, Model model) {
    model.addAttribute("post", cloneditService.getPost(id));
    model.addAttribute("newComment", new Comment());
    return "post_details";
  }

  @PostMapping("/{id}/details")
  public String saveComment(@PathVariable long id, Comment comment) {
    cloneditService.saveComment(comment, id);
    return "redirect:/" + id + "/details";
  }

  @PostMapping("/{id}/details/upvote")
  public String upvoteAtPostDetails(@PathVariable("id") long id) {
    cloneditService.upvotePost(id);
    return "redirect:/" + id + "/details";
  }

  @PostMapping("/{id}/details/downvote")
  public String downvoteAtPostDetails(@PathVariable("id") long id) {
    cloneditService.downvotePost(id);
    return "redirect:/" + id + "/details";
  }

}
