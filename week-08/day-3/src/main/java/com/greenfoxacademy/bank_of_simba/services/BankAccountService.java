package com.greenfoxacademy.bank_of_simba.services;

import com.greenfoxacademy.bank_of_simba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {

  private List<BankAccount> bankAccountList;

  public BankAccountService() {
    bankAccountList = new ArrayList<>();
    fillList();
  }

  private void fillList() {
    bankAccountList.add(new BankAccount("Simba", 2000, "lion", true, true));
    bankAccountList.add(new BankAccount("Zazu", 750, "hornbill", true));
    bankAccountList.add(new BankAccount("Rafiki", 0, "mandrill ", true));
    bankAccountList.add(new BankAccount("Scar", 1500, "lion", false));
    bankAccountList.add(new BankAccount("Ed", 150, "hyena", false));
  }

  public List<BankAccount> getBankAccountList() {
    return bankAccountList;
  }

  public void addToBankAccountList(BankAccount bankAccount) {
    bankAccountList.add(bankAccount);
  }

  public void raiseBalance(String name) {
    for (BankAccount bankAccount : bankAccountList) {
      if(bankAccount.getName().equals(name) && bankAccount.isOwnerKing()) {
        bankAccount.setBalance(bankAccount.getBalance() + 100);
      } else if(bankAccount.getName().equals(name)) {
        bankAccount.setBalance(bankAccount.getBalance() + 10);
      }
    }
  }
}
