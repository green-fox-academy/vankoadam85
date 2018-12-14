package com.greenfoxacademy.fox_club.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private List<String> tricks;
  private String food;
  private String drink;
  private String imgLocation;

  public Fox(String name) {
    this.name = name;
    this.tricks = new ArrayList<>();
    this.food = "squab";
    this.drink = "water";
    this.imgLocation = "/img/MrFox.jpg";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTricks() {
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

  public void setImgLocation(String imgLocation) {
    this.imgLocation = imgLocation;
  }
}
