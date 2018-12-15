package com.greenfoxacademy.fox_club.controllers;

import com.greenfoxacademy.fox_club.services.AnimalManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private AnimalManager animals;

  @Autowired
  MainController(AnimalManager animalManager) {
    this.animals = animalManager;
  }

  @GetMapping("/")
  public String login(@ModelAttribute(name="name") String name) {
    return "login";
  }

  @PostMapping("/")
  public String getAnimal(@ModelAttribute(name="name") String name) {
    if(animals.doesAnimalExist(name)) {
      return "redirect:/info" + name;
    } else {
      return "redirect:/createAnimal";
    }
  }

  @GetMapping("/foxInfo")
  public String getFoxInfo(@RequestParam(value = "name") String name, Model model) {
    model.addAttribute("fox", animals.getFoxByName(name));
    return "foxInfo";
  }

}
