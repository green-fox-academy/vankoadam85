package com.greenfoxacademy.fox_club.models;

import java.util.ArrayList;

public abstract class Animal {

  private String name;
  private ArrayList<String> tricks;
  String food;
  String drink;
  String imgLocation;
  String species;

  Animal(String name) {
    this.name = name;
    this.tricks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public ArrayList<String> getTricks() {
    return tricks;
  }

  public void addTrick(String trick) {
    this.tricks.add(trick);
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public String getImgLocation() {
    return imgLocation;
  }

  public String getSpecies() {
    return species;
  }
}
