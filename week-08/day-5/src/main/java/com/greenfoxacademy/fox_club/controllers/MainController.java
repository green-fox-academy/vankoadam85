package com.greenfoxacademy.fox_club.controllers;

import com.greenfoxacademy.fox_club.services.AnimalManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private AnimalManager animals;

  @Autowired
  MainController(AnimalManager animalManager) {
    this.animals = animalManager;
  }

  @GetMapping("/")
  public String getAnimal(@RequestParam(value = "animalName", required = false) String animalName) {
    if (animalName == null) {
      return "login";
    } else if(animals.doesAnimalExist(animalName)) {
      return "redirect:/info/" + animalName;
    } else {
      return "redirect:/createAnimal";
    }
  }

  @GetMapping("/info/{name}")
  public String getAnimalInfo(@PathVariable String name, Model model) {
    model.addAttribute("animal", animals.getAnimalByName(name));
    return "animalInfo";
  }

}
