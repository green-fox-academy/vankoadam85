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

  Todo(String title, boolean urgent) {
    this.title = title;
    this.urgent = urgent;
    this.done = false;
  }

  public String getTitle() {
    return title;
  }
}
