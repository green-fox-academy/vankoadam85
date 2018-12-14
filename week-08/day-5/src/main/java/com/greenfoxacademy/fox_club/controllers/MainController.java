package com.greenfoxacademy.fox_club.controllers;

import com.greenfoxacademy.fox_club.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String getMainPage(Model model, Fox fox) {
    model.addAttribute("fox", fox);
    return "index";
  }

}
