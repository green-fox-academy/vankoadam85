package com.greenfoxacademy.dependency_practice.service;

public class RedColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is red in color...");
  }
}
