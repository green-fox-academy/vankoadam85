package com.greenfoxacademy.dependency_practice.controller;

import com.greenfoxacademy.dependency_practice.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DIPracticeController {

  private UtilityService utilityService;

  @Autowired
  DIPracticeController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String usefulPage() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String coloredBackgroundPage(Model model) {
    model.addAttribute("backgroundColor", utilityService.randomColor());
    return "coloredBackground";
  }

}
