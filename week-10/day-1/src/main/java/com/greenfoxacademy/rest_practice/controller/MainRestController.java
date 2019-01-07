package com.greenfoxacademy.rest_practice.controller;

import com.greenfoxacademy.rest_practice.dto.Until;
import com.greenfoxacademy.rest_practice.exception.*;
import com.greenfoxacademy.rest_practice.model.AAppender;
import com.greenfoxacademy.rest_practice.dto.DoUntil;
import com.greenfoxacademy.rest_practice.model.DoubleNumber;
import com.greenfoxacademy.rest_practice.model.Greeting;
import com.greenfoxacademy.rest_practice.service.RestPracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MainRestController {

  private RestPracticeService restPracticeService;

  @Autowired
  MainRestController(RestPracticeService restPracticeService) {
    this.restPracticeService = restPracticeService;
  }

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
    Greeting greeting = new Greeting(optionalName.orElseThrow(NoNameProvidedException::new),
        optionalTitle.orElseThrow(NoTitleProvidedException::new));
    greeting.createWelcome_message();
    return greeting;
  }

  @GetMapping("/append/{appendable}")
  public AAppender appendA(@PathVariable("appendable") String appendable) {
    AAppender aAppender = new AAppender(appendable);
    aAppender.createAppended();
    return aAppender;
  }

  @PostMapping("/dountil/{action}")
  public DoUntil doUntil(@PathVariable("action") String action, @RequestBody(required = false) Until input) {
    Optional<Until> optionalInput = Optional.ofNullable(input);
    if (action.equals("sum")) {
      return new DoUntil(optionalInput.orElseThrow(NoNumberProvidedException::new).getUntil(),
          restPracticeService.sumUntil(optionalInput.orElseThrow(NoNumberProvidedException::new).getUntil()));
    } else if (action.equals("factor")) {
      return new DoUntil(optionalInput.orElseThrow(NoNumberProvidedException::new).getUntil(),
          restPracticeService.factorial(optionalInput.orElseThrow(NoNumberProvidedException::new).getUntil()));
    } else {
      throw new NotFoundException();
    }
  }

}
