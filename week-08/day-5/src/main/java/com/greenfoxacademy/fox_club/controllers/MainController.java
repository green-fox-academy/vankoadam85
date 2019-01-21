package com.greenfoxacademy.fox_club.controllers;

import com.greenfoxacademy.fox_club.models.Animal;
import com.greenfoxacademy.fox_club.models.Fox;
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
      return "redirect:/chooseSpecies?animalName=" + animalName;
    }
  }

  @GetMapping("/chooseSpecies")
  public String chooseSpecies(@RequestParam("animalName") String animalName, Model model, @ModelAttribute("animal") Animal animal) {
    model.addAttribute("animalName", animalName);
    model.addAttribute("animal", animal);
    return "/createAnimal?animalName=" + animalName;
  }

  @PostMapping("/createAnimal")
  public String createAnimal(@RequestParam("animalName") String animalName, @ModelAttribute("animal") Animal animal) {
    return "/info/" + animalName;
  }

  @GetMapping("/info/{name}")
  public String getAnimalInfo(@PathVariable String name, Model model) {
    model.addAttribute("animal", animals.getAnimalByName(name));
    return "animalInfo";
  }

}
