package com.greenfoxacademy.dependency_practice.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  private ArrayList<String> colors;
  private Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public boolean validateEmail(String emailAddressToCheck) {
    return emailAddressToCheck.contains(".") && emailAddressToCheck.contains("@");
  }

  public String caesarEncode(String text, int number) {
    if (number < 0) {
      number = 26 + number;
    }

    String result = "";
    for(int i = 0; i < text.length(); i++) {
      int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
      result += (char)(((int)text.charAt(i) + number - offset) % 26 + offset);
    }
    return result;
  }

}
