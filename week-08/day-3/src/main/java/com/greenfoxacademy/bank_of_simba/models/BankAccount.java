package com.greenfoxacademy.bank_of_simba.models;

public class BankAccount {

  private String name;
  private double balance;
  private String animalType;
  private String currency;

  public BankAccount(String name, int balance, String animalType, String currency) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = currency;
  }

  public BankAccount(String name, int balance, String animalType) {
    this(name, balance, animalType, "Zebra");
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}
