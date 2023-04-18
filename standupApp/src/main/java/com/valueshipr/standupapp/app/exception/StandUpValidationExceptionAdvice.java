package com.valueshipr.standupapp.app.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StandUpValidationExceptionAdvice {
  
  @ExceptionHandler(StandUpValidationException.class)
  public ResponseEntity<String> handleStandUpValidationException(StandUpValidationException e) {
    return ResponseEntity.badRequest().body(e.getMessage());
  }
  
}
