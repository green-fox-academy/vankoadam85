package com.greenfoxacademy.springstart.Controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  long id;
  static AtomicLong idCounter = new AtomicLong(1);
  String content;

  Greeting(String content) {
    this.id = idCounter.getAndIncrement();
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public String toString() {
    return "id: " + id + ", content: " + content;
  }

}
