package com.greenfoxacademy.dependency_practice.Service;

import org.springframework.stereotype.Service;

public class GreenColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is green in color...");
  }
}
