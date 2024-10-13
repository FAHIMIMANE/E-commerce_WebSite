package com.fivebeans.apigatewayservice.exception;

import lombok.Getter;


@Getter
public class RunTimeExceptionPlaceHolder extends RuntimeException {

  private int httpStatus;

  public RunTimeExceptionPlaceHolder(String message, int httpStatus) {
    super(message);
    this.httpStatus = httpStatus;
  }

}
