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

}
