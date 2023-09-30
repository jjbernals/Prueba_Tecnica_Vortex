package com.example.demo.exception.advice;
import com.example.demo.exception.ConductorNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ConductorNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(ConductorNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleConductorNotFoundExcepction(ConductorNotFoundException ex){ return ex.getMessage(); }
}
