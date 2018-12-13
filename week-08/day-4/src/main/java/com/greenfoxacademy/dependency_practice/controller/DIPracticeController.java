package com.greenfoxacademy.dependency_practice.controller;

import com.greenfoxacademy.dependency_practice.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DIPracticeController {

  private UtilityService utilityService;

  @Autowired
  DIPracticeController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @RequestMapping("/useful")
  public String usefulPage(Model model) {
    model.addAttribute("backgroundColor", utilityService.randomColor());
    return "useful";
  }
}
