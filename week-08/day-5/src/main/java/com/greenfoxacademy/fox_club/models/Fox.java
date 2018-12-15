package com.greenfoxacademy.fox_club.models;


public class Fox extends Animal {

  public Fox(String name) {
    super(name);
    this.species = "fox";
    this.food = "squab";
    this.drink = "water";
    this.imgLocation = "/img/MrFox.jpg";
  }


}
