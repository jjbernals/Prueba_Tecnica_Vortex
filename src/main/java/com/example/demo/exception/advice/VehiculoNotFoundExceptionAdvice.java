package com.example.demo.exception.advice;

import com.example.demo.exception.VehiculoNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class VehiculoNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(VehiculoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleVehiculoNotFoundExcepction(VehiculoNotFoundException ex){ return ex.getMessage(); }
}
