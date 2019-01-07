package com.greenfoxacademy.rest_practice.service;

import org.springframework.stereotype.Service;

@Service
public class RestPracticeService {

  public int sumUntil(int input) {
    int result = 0;
    for (int i = 1; i <= input; i++) {
      result += i;
    }
    return result;
  }

  public int factorial(int input) {
    if (input == 1) {
      return 1;
    } else {
      return input * factorial(input - 1);
    }
  }

}
