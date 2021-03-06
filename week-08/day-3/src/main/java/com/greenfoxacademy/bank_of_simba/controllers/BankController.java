package com.greenfoxacademy.bank_of_simba.controllers;

import com.greenfoxacademy.bank_of_simba.models.BankAccount;
import com.greenfoxacademy.bank_of_simba.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

  private BankAccountService bankAccountService;

  @Autowired
  BankController(BankAccountService bankAccountService) {
    this.bankAccountService = bankAccountService;
  }

  @GetMapping("/show")
  public String showAccount(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", true, true);
    model.addAttribute("bankAccount", bankAccount);
    return "showAccount";
  }

  @GetMapping("/HTMLception")
  public String HTMLception() {
    return "HTMLception";
  }

  @GetMapping("/showAllAccounts")
  public String showAllAccounts(Model model) {
    model.addAttribute("bankAccountList", bankAccountService.getBankAccountList());
    return "showAll";
  }

  @GetMapping("/raiseBalance")
  public String raiseBalance(Model model) {
    model.addAttribute("bankAccountList", bankAccountService.getBankAccountList());
    return "raiseBalance";
  }

}
