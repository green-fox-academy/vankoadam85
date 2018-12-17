package com.greenfoxacademy.todo_from_sql.model;

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

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public long getId() {
    return id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }
}
