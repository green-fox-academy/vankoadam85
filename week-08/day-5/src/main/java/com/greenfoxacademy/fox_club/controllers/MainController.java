package com.greenfoxacademy.fox_club.controllers;

import com.greenfoxacademy.fox_club.services.SkulkOfFoxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private SkulkOfFoxes foxes;

  @Autowired
  MainController(SkulkOfFoxes skulkOfFoxes) {
    this.foxes = skulkOfFoxes;
  }

  @GetMapping("/")
  public String getMainPage(@RequestParam(value = "name", required = false) String name, Model model) {
    model.addAttribute("fox", foxes.getFoxByName(name));
    return "index";
  }

}
