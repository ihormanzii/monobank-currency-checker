package com.ihormanzii.monobankcurrencychecker.errors.handler;

import com.ihormanzii.monobankcurrencychecker.errors.exception.TooManyRequestsException;
import com.ihormanzii.monobankcurrencychecker.errors.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {
    @ExceptionHandler({TooManyRequestsException.class})
    public ResponseEntity<ErrorDTO> handleTooManyRequests(Exception ex) {
        return new ResponseEntity<>(new ErrorDTO(ex.getLocalizedMessage()), HttpStatus.TOO_MANY_REQUESTS);
    }
}
