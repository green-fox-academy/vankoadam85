package com.greenfoxacademy.rest_practice.controller;

import com.greenfoxacademy.rest_practice.exception.InputNotFoundException;
import com.greenfoxacademy.rest_practice.exception.NoNameProvidedException;
import com.greenfoxacademy.rest_practice.exception.NoTitleProvidedException;
import com.greenfoxacademy.rest_practice.model.DoubleNumber;
import com.greenfoxacademy.rest_practice.model.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public DoubleNumber doubleInput(@RequestParam(value = "input", required = false) Integer input) {
    Optional<Integer> inputToDouble = Optional.ofNullable(input);
    DoubleNumber doubleToReturn = new DoubleNumber();
    doubleToReturn.setReceived(inputToDouble.orElseThrow(InputNotFoundException::new));
    doubleToReturn.setResult();
    return doubleToReturn;
  }

  @GetMapping("/greeter")
  public Greeting greetSomeone(@RequestParam(value = "name", required = false) String name,
                               @RequestParam(value = "title", required = false) String title) {
    Optional<String> optionalName = Optional.ofNullable(name);
    Optional<String> optionalTitle = Optional.ofNullable(title);
    return new Greeting(optionalName.orElseThrow(NoNameProvidedException::new),
        optionalTitle.orElseThrow(NoTitleProvidedException::new));
  }

}
