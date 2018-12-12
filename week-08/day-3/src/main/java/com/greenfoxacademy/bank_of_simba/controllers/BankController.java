package com.greenfoxacademy.bank_of_simba.controllers;

import com.greenfoxacademy.bank_of_simba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

  @GetMapping("/show")
  public String showAccount(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("bankAccount", bankAccount);
    return "showAccount";
  }

  @GetMapping("/HTMLception")
  public String HTMLception() {
    return "HTMLception";
  }

}
