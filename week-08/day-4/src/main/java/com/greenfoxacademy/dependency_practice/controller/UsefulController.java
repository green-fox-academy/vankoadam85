package com.greenfoxacademy.dependency_practice.controller;

import com.greenfoxacademy.dependency_practice.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/useful")
public class UsefulController {

  private UtilityService utilityService;

  @Autowired
  UsefulController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping()
  public String usefulPage() {
    return "useful";
  }

  @GetMapping("/colored")
  public String coloredBackgroundPage(Model model) {
    model.addAttribute("backgroundColor", utilityService.randomColor());
    return "coloredBackground";
  }

  @GetMapping("/email")
  public String emailValidator(@RequestParam("email") String email, Model model) {
    model.addAttribute("isEmailValid", utilityService.validateEmail(email));
    model.addAttribute("email", email);
    return "validateEmail";
  }

  @GetMapping("/encode")
  public String caesarEncode(@RequestParam("text") String text, @RequestParam("number") int number, Model model) {
    model.addAttribute("resultingText", utilityService.caesarEncode(text, number));
    return "caesarText";
  }

  @GetMapping("/decode")
  public String caesarDecode(@RequestParam("text") String text, @RequestParam("number") int number, Model model) {
    model.addAttribute("resultingText", utilityService.caesarEncode(text, -number));
    return "caesarText";
  }

}
