package com.ms.gamehub.shared;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.PersistenceException;
import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(PersistenceException.class)
    public ErrorHandlerResponse persistenceErrorResponse(HttpServletRequest req, Exception e) {
        return new ErrorHandlerResponse("Error while trying to persist object to database", e.getMessage());
    }
}
