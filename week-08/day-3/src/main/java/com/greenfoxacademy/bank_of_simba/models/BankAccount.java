package com.greenfoxacademy.bank_of_simba.models;

public class BankAccount {

  private String name;
  private double balance;
  private String animalType;
  private String currency;
  private boolean isOwnerKing;

  public BankAccount(String name, int balance, String animalType, String currency, boolean isOwnerKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = currency;
    this.isOwnerKing = isOwnerKing;
  }

  public BankAccount(String name, int balance, String animalType, String currency) {
    this(name, balance, animalType, currency, false);
  }
  public BankAccount(String name, int balance, String animalType, boolean isOwnerKing) {
    this(name, balance, animalType, "Zebra", isOwnerKing);
  }

  public BankAccount(String name, int balance, String animalType) {
    this(name, balance, animalType, "Zebra", false);
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

  public boolean isOwnerKing() {
    return isOwnerKing;
  }

  public void setOwnerKing(boolean ownerKing) {
    isOwnerKing = ownerKing;
  }
}
