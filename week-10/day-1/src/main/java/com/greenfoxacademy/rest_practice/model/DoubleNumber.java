package com.greenfoxacademy.rest_practice.model;

public class DoubleNumber {

  private int received;
  private int result;

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult() {
    this.result = this.received * 2;
  }
}
