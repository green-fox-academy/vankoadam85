package com.greenfox.error.controller;

import com.greenfox.error.model.User;
import com.greenfox.error.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {

  private UserService service;

  @Autowired
  AppController(UserService userService) {
    this.service = userService;
  }

  @GetMapping("/app")
  public String index(@ModelAttribute("user") User user, Model model) {
    model.addAttribute("yolo", service.getAll());
    return "main";
  }

  @PostMapping("/app")
  public String create(User user) {
    service.save(user);
    return "redirect:/app";
  }
}
