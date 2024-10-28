package com.cour.dro.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PleaseProvideValueHandler {

    @ExceptionHandler(PleaseProvideValue.class)
    public ResponseEntity<String> handlePleaseProvideValue(PleaseProvideValue ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
