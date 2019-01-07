package com.greenfoxacademy.rest_practice.controller;

import com.greenfoxacademy.rest_practice.exception.ErrorMessage;
import com.greenfoxacademy.rest_practice.exception.InputNotFoundException;
import com.greenfoxacademy.rest_practice.model.DoubleNumber;
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

  @ExceptionHandler(InputNotFoundException.class)
  @ResponseBody
  public ErrorMessage noInput() {
    return new ErrorMessage("Please provide an input!");
  }

}
