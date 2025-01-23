package com.devsuperior.dslist.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class CustomizeExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<StandardException> handleAllExcetions(Exception ex, HttpServletRequest request) {
        StandardException standardException = new StandardException(Instant.now(), ex.getMessage(), request.getPathInfo());

        return new ResponseEntity<>(standardException, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
