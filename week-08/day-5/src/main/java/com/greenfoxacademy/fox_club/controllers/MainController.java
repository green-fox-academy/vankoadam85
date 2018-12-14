package com.greenfoxacademy.fox_club.controllers;

import com.greenfoxacademy.fox_club.models.Fox;
import com.greenfoxacademy.fox_club.services.SkulkOfFoxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private SkulkOfFoxes foxes;

  @Autowired
  MainController(SkulkOfFoxes skulkOfFoxes) {
    this.foxes = skulkOfFoxes;
  }

  @GetMapping("/")
  public String login(@ModelAttribute(name="fox") Fox fox) {
    return "login";
  }

  @PostMapping("/")
  public String getFox(@ModelAttribute(name="fox") Fox fox) {
    foxes.addFox(fox);
    return "redirect:/foxInfo?name=" + fox.getName();
  }

  @GetMapping("/foxInfo")
  public String getFoxInfo(@RequestParam(value = "name") String name, Model model) {
    model.addAttribute("fox", foxes.getFoxByName(name));
    return "foxInfo";
  }

}
