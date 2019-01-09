package com.greenfoxacademy.rest_practice.service;

import org.springframework.stereotype.Service;

@Service
public class RestPracticeServiceImpl implements RestPracticeService {

  public int doubleNumber(int input) {
    return input * 2;
  }

  public String greet(String name, String title) {
    return "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String appendA(String appendable) {
    return appendable + "a";
  }

  public int sum(int input) {
    int result = 0;
    for (int i = 1; i <= input; i++) {
      result += i;
    }
    return result;
  }

  public int factor(int input) {
    if (input == 1) {
      return 1;
    } else {
      return input * factor(input - 1);
    }
  }

  public int sumArray(int... input) {
    int result = 0;
    for (int number : input) {
      result += number;
    }
    return result;
  }

  public int multiplyArray(int... input) {
    int result = 1;
    for (int number : input) {
      result *= number;
    }
    return result;
  }

  public int[] doubleArray(int... input) {
    int[] result = new int[input.length];
    for (int i = 0; i < input.length; i++) {
      result[i] = input[i] * 2;
    }
    return result;
  }

}
