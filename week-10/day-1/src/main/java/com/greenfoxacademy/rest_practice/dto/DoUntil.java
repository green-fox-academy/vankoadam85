package com.greenfoxacademy.rest_practice.dto;

public class DoUntil {

  private Integer until;
  private int result;

  public DoUntil(int until, int result) {
    this.until = until;
    this.result = result;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
