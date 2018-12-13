package com.greenfoxacademy.dependency_practice.service;

public class GreenColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is green in color...");
  }
}
