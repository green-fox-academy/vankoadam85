package com.greenfoxacademy.bank_of_simba.models;

public class BankAccount {

  private String name;
  private double balance;
  private String animalType;
  private String currency;
  private boolean isOwnerKing;
  private boolean isOwnerGoodGuy;

  public BankAccount(String name, int balance, String animalType, String currency, boolean isOwnerKing, boolean isOwnerGoodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = currency;
    this.isOwnerKing = isOwnerKing;
    this.isOwnerGoodGuy = isOwnerGoodGuy;
  }

  public BankAccount(String name, int balance, String animalType, String currency, boolean isOwnerGoodGuy) {
    this(name, balance, animalType, currency, false, isOwnerGoodGuy);
  }
  public BankAccount(String name, int balance, String animalType, boolean isOwnerKing, boolean isOwnerGoodGuy) {
    this(name, balance, animalType, "Zebra", isOwnerKing, isOwnerGoodGuy);
  }

  public BankAccount(String name, int balance, String animalType, boolean isOwnerGoodGuy) {
    this(name, balance, animalType, "Zebra", false, isOwnerGoodGuy);
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

  public boolean isOwnerGoodGuy() {
    return isOwnerGoodGuy;
  }

  public void setOwnerGoodGuy(boolean ownerGoodGuy) {
    isOwnerGoodGuy = ownerGoodGuy;
  }
}
