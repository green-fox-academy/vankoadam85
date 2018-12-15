package com.greenfoxacademy.fox_club.services;

import com.greenfoxacademy.fox_club.models.Animal;
import com.greenfoxacademy.fox_club.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AnimalManager {

  private ArrayList<Animal> animals;

  AnimalManager() {
    animals = new ArrayList<>();
  }

  public ArrayList<Animal> getAnimals() {
    return animals;
  }

  public void addAnimal(Animal animal){
    this.animals.add(animal);
  }

  public boolean doesAnimalExist(String name) {
    return animals.stream()
        .anyMatch(animal -> animal.getName().equals(name));
  }

  public Animal getAnimalByName(String name) {
    return animals.stream()
        .filter(animal -> animal.getName().equals(name))
        .findFirst()
        .get();
  }

}
