package com.greenfoxacademy.rest_practice.dto;

public class LogDto {

  private long id;
  private String endpoint;
  private String data;

  public LogDto(long id, String endpoint, String data) {
    this.id = id;
    this.endpoint = endpoint;
    this.data = data;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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
