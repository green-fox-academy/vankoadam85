package com.greenfoxacademy.dependency_practice.Service;

import org.springframework.stereotype.Service;

public class RedColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is red in color...");
  }
}
