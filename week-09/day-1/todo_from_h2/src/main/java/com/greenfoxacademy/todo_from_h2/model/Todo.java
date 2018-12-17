package com.greenfoxacademy.todo_from_h2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo() {
    this.done = false;
  }

  public Todo(String title, boolean urgent) {
    this();
    this.title = title;
    this.urgent = urgent;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return urgent;
  }
}
