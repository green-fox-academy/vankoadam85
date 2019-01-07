package com.greenfoxacademy.rest_practice.exception;

public class ErrorMessage {

  private String error;

  public ErrorMessage(String message) {
    this.error = message;
  }

  public String getError() {
    return error;
  }
}
