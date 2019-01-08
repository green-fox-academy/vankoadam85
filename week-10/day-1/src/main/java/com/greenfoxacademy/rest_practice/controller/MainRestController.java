package com.greenfoxacademy.rest_practice.controller;

import com.greenfoxacademy.rest_practice.dto.*;
import com.greenfoxacademy.rest_practice.exception.*;
import com.greenfoxacademy.rest_practice.service.RestPracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MainRestController {

  private RestPracticeService restPracticeService;

  @Autowired
  MainRestController(RestPracticeService restPracticeService) {
    this.restPracticeService = restPracticeService;
  }

  @GetMapping("/doubling")
  public DoublingResponseDto doubling(@RequestParam(value = "input", required = false) Integer input) {
    Optional<Integer> optionalInput = Optional.ofNullable(input);
    DoublingResponseDto doublingResponseDto = new DoublingResponseDto();
    doublingResponseDto.setReceived(optionalInput.orElseThrow(NoInputProvidedException::new));
    doublingResponseDto.setResult(restPracticeService.doubleNumber(optionalInput.orElseThrow(NoInputProvidedException::new)));
    return doublingResponseDto;
  }

  @GetMapping("/greeter")
  public GreeterResponseDto greeter(@RequestParam(value = "name", required = false) String name,
                                    @RequestParam(value = "title", required = false) String title) {
    Optional<String> optionalName = Optional.ofNullable(name);
    Optional<String> optionalTitle = Optional.ofNullable(title);
    GreeterResponseDto greeterResponseDto = new GreeterResponseDto();
    greeterResponseDto.setWelcome_message(restPracticeService.greet(
        optionalName.orElseThrow(NoNameProvidedException::new), optionalTitle.orElseThrow(NoTitleProvidedException::new)));
    return greeterResponseDto;
  }

  @GetMapping("/appenda/{appendable}")
  public AppendAResponseDto appendA(@PathVariable("appendable") String appendable) {
    Optional<String> optionalAppendable = Optional.ofNullable(appendable);
    AppendAResponseDto appendAResponseDto = new AppendAResponseDto();
    appendAResponseDto.setAppended(restPracticeService.appendA(optionalAppendable.orElseThrow(NotFoundException::new)));
    return appendAResponseDto;
  }

  @PostMapping("/dountil/{action}")
  public DoUntilResponseDto doUntil(@PathVariable("action") String action,
                                    @RequestBody(required = false) DoUntilRequestDto input) {
    Optional<Integer> optionalInput = Optional.ofNullable(input.getUntil());
    DoUntilResponseDto doUntilResponseDto = new DoUntilResponseDto();
    doUntilResponseDto.setUntil(optionalInput.orElseThrow(NoNumberProvidedException::new));
    if (action.equals("sum")) {
      doUntilResponseDto.setResult(restPracticeService.sum(optionalInput.orElseThrow(NoNumberProvidedException::new)));
    } else if(action.equals("factor")) {
      doUntilResponseDto.setResult(restPracticeService.factor(optionalInput.orElseThrow(NoNameProvidedException::new)));
    } else {
      throw new NotFoundException();
    }
    return doUntilResponseDto;
  }

}
