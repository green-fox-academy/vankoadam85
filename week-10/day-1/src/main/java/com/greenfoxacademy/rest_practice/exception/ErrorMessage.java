package com.greenfoxacademy.rest_practice.exception;

public class ErrorMessage {

  private String error;

  ErrorMessage(String message) {
    this.error = message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
