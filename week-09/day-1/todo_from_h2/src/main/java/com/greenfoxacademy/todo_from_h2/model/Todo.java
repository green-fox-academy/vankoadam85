package com.greenfoxacademy.todo_from_h2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;



}
