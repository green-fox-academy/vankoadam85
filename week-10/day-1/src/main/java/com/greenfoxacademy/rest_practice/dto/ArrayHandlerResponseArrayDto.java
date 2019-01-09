package com.greenfoxacademy.rest_practice.dto;

public class ArrayHandlerResponseArrayDto extends ArrayHandlerResponseDto {

  private int[] result;

  public ArrayHandlerResponseArrayDto(int... result) {
    this.result = result;
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int... result) {
    this.result = result;
  }
}
