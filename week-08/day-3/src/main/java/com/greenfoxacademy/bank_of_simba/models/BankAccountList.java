package com.greenfoxacademy.bank_of_simba.models;

import java.util.ArrayList;
import java.util.List;

public class BankAccountList {

  private List<BankAccount> bankAccountList;

  public BankAccountList() {
    bankAccountList = new ArrayList<>();
    fillList();
  }

  private void fillList() {
    bankAccountList.add(new BankAccount("Simba", 2000, "lion"));
    bankAccountList.add(new BankAccount("Zazu", 750, "hornbill"));
    bankAccountList.add(new BankAccount("Rafiki", 0, "mandrill "));
    bankAccountList.add(new BankAccount("Scar", 1500, "lion"));
    bankAccountList.add(new BankAccount("Ed", 150, "hyena"));
  }

  public List<BankAccount> getBankAccountList() {
    return bankAccountList;
  }

  public void addToBankAccountList(BankAccount bankAccount) {
    bankAccountList.add(bankAccount);
  }
}
