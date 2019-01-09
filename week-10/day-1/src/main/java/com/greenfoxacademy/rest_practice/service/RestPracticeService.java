package com.greenfoxacademy.rest_practice.service;

public interface RestPracticeService {

  int doubleNumber(int input);

  int sum(int input);

  int factor(int input);

  String greet(String name, String title);

  String appendA(String appendable);

  int sumArray(int... input);

  public int multiplyArray(int... input);

  public int[] doubleArray(int... input);

}
