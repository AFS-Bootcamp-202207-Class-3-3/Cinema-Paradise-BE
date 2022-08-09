package com.thoughtworks.training.advice;

import com.thoughtworks.training.exception.MovieNotFoundEException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerAdvice {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(MovieNotFoundEException.class)
    public ErrorResponse handleNotFound(MovieNotFoundEException exception) {
        return new ErrorResponse(exception.getMessage(), HttpStatus.NOT_FOUND.name());
    }
}
