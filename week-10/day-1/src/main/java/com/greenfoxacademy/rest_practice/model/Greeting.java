package com.greenfoxacademy.rest_practice.model;

public class Greeting {

  private String name;
  private String title;
  private String welcome_message;

  public Greeting(String name, String title) {
    this.name = name;
    this.title = title;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWelcome_message() {
    return "Oh, hi there " + this.name + ", my dear " + this.title + "!";
  }
}
