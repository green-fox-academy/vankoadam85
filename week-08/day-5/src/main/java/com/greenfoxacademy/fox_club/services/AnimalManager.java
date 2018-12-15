package com.greenfoxacademy.fox_club.services;

import com.greenfoxacademy.fox_club.models.Animal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.function.Predicate;

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
    return animals.stream().anyMatch(animal -> animal.getName().equals(name));
  }

}
