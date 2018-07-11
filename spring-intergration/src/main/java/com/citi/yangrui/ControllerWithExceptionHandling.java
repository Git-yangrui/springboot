package com.citi.yangrui;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
public class ControllerWithExceptionHandling {

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)  // 500
    @ExceptionHandler(OrderNotFoundException.class)
    @ResponseBody
    public RestServiceError handleException(Exception ex) {
        return RestServiceError.build(RestServiceError.Type.INTERNAL_SERVER_ERROR, ex.getMessage());
    }


    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(UserNotFountException.class)
    @ResponseBody
    public RestServiceError UserNotFound(Exception e) {
        return RestServiceError.build(RestServiceError.Type.INTERNAL_SERVER_ERROR, ((UserNotFountException)e).getUserId());
    }
}