package com.greenfoxacademy.rest_practice.controller;

import com.greenfoxacademy.rest_practice.dto.*;
import com.greenfoxacademy.rest_practice.exception.*;
import com.greenfoxacademy.rest_practice.service.RestPracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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
    if (optionalInput.isPresent()) {
      restPracticeService.saveLog("/doubling", input.toString());
    } else {
      restPracticeService.saveLog("/doubling", "No data provided");
    }
    DoublingResponseDto doublingResponseDto = new DoublingResponseDto();
    doublingResponseDto.setReceived(optionalInput.orElseThrow(NoInputProvidedException::new));
    doublingResponseDto.setResult(restPracticeService.doubleNumber(optionalInput.orElseThrow(NoInputProvidedException::new)));
    return doublingResponseDto;
  }

  @GetMapping("/greeter")
  public GreeterResponseDto greeter(@RequestParam(value = "name", required = false) String name,
                                    @RequestParam(value = "title", required = false) String title) {
    restPracticeService.saveLog("/greeter", "name: " + name + ", title:" + title);
    Optional<String> optionalName = Optional.ofNullable(name);
    Optional<String> optionalTitle = Optional.ofNullable(title);
    GreeterResponseDto greeterResponseDto = new GreeterResponseDto();
    greeterResponseDto.setWelcome_message(restPracticeService.greet(
        optionalName.orElseThrow(NoNameProvidedException::new), optionalTitle.orElseThrow(NoTitleProvidedException::new)));
    return greeterResponseDto;
  }

  @GetMapping("/appenda/{appendable}")
  public AppendAResponseDto appendA(@PathVariable("appendable") String appendable) {
    restPracticeService.saveLog("/appenda/", "appendable: " + appendable);
    Optional<String> optionalAppendable = Optional.ofNullable(appendable);
    AppendAResponseDto appendAResponseDto = new AppendAResponseDto();
    appendAResponseDto.setAppended(restPracticeService.appendA(optionalAppendable.orElseThrow(NotFoundException::new)));
    return appendAResponseDto;
  }

  @PostMapping("/dountil/{action}")
  public DoUntilResponseDto doUntil(@PathVariable("action") String action,
                                    @RequestBody(required = false) DoUntilRequestDto input) {
    restPracticeService.saveLog("/dountil/", "action: " + action + ", until: " + input.getUntil());
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

  @PostMapping("/arrays")
  public ArrayHandlerResponseDto arrayHandler(@RequestBody(required = false) ArrayHandlerRequestDto input) {
    Optional<ArrayHandlerRequestDto> optionalInput = Optional.ofNullable(input);
    if (optionalInput.isPresent()) {
      restPracticeService.saveLog("/arrays", "what to do: " + input.getWhat() + ", numbers: " + Arrays.toString(input.getNumbers()));
      } else {
      restPracticeService.saveLog("/arrays", "No data provided");
    }
    Optional<String> optionalInputWhat = Optional.ofNullable(optionalInput.orElseThrow(NoWhatProvidedException::new).getWhat());
    Optional<int[]> optionalInputNumbers = Optional.ofNullable(optionalInput.orElseThrow(NoWhatProvidedException::new).getNumbers());
    switch (optionalInputWhat.orElseThrow(NoWhatProvidedException::new)) {
      case "sum":
        return new ArrayHandlerResponseIntDto(restPracticeService.sumArray(
            optionalInputNumbers.orElseThrow(NoNumberProvidedException::new)));
      case "multiply":
        return new ArrayHandlerResponseIntDto(restPracticeService.multiplyArray(
            optionalInputNumbers.orElseThrow(NoNumberProvidedException::new)));
      case "double":
        return new ArrayHandlerResponseArrayDto(restPracticeService.doubleArray(
            optionalInputNumbers.orElseThrow(NoNumberProvidedException::new)));
      default:
         throw new NotFoundException();
    }
  }

  @GetMapping("/log")
  public LogReportDto log() {
    return restPracticeService.getLogReport();
  }

}
