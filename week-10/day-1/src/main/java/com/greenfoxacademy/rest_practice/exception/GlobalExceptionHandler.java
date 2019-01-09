package com.greenfoxacademy.rest_practice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(NoInputProvidedException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  public ErrorMessage noInput() {
    return new ErrorMessage("Please provide an input!");
  }

  @ExceptionHandler(NoNameProvidedException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  public ErrorMessage noName() {
    return new ErrorMessage("Please provide a name!");
  }

  @ExceptionHandler(NoTitleProvidedException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  public ErrorMessage noTitle() {
    return new ErrorMessage("Please provide a title!");
  }

  @ExceptionHandler({NoNumberProvidedException.class})
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  public ErrorMessage noNumber() {
    return new ErrorMessage("Please provide a number!");
  }

  @ExceptionHandler(NotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public void notFound() {
  }

  @ExceptionHandler(NoWhatProvidedException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  public ErrorMessage noWhat() {
    return new ErrorMessage("Please provide what to do with the numbers!");
  }

}
