package com.greenfoxacademy.rest_practice.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Log {

  @Id
  @GeneratedValue
  private long id;
  @CreationTimestamp
  private Date createdAt;
  private String endpoint;
  private String data;

  public Log() {
  }

  public Log(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
  }

  public long getId() {
    return id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
