package com.greenfoxacademy.rest_practice.model;

public class AAppender {

  private String appendable;
  private String appended;

  public AAppender(String appendable) {
    this.appendable = appendable;
  }

  public void setAppendable(String appendable) {
    this.appendable = appendable;
  }

  public void createAppended() {
    this.appended = appendable + "a";
  }

  public String getAppended() {
    return appended;
  }

}
