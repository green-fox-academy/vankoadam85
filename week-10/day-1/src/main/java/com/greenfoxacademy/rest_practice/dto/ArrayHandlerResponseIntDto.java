package com.greenfoxacademy.rest_practice.dto;

public class ArrayHandlerResponseIntDto extends ArrayHandlerResponseDto {

  private int result;

  public ArrayHandlerResponseIntDto(int result) {
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
