package com.greenfoxacademy.fox_club.services;

import com.greenfoxacademy.fox_club.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SkulkOfFoxes {

  private ArrayList<Fox> foxes;

  SkulkOfFoxes() {
    foxes = new ArrayList<>();
  }

  public ArrayList<Fox> getFoxes() {
    return foxes;
  }

  public void addFox(Fox fox) {
    this.foxes.add(fox);
  }

  public Fox getFoxByName(String name) {
    for (Fox fox : foxes) {
      if (fox.getName().equals(name)){
        return fox;
      }
    }
    return null;
  }

}
