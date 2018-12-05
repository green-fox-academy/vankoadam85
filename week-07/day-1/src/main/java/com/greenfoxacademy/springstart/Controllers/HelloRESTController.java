package com.greenfoxacademy.springstart.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping("/greeting")
  @ResponseBody
  public String greeting(@RequestParam("name") String name) {
    Greeting greeting = new Greeting("Hello, " + name);
    return greeting.toString();
  }

}
