package com.blank.products.exceptions;

import com.blank.products.models.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class RestResponseEntityHandler extends ResponseEntityExceptionHandler{

    @ExceptionHandler(ProductCustomException.class)
    public ResponseEntity<ErrorResponse> handleProductResponseEntity(ProductCustomException exception){

        return new ResponseEntity<>(ErrorResponse.builder()
                .errorMessage(exception.getMessage())
                .errorCode(exception.getErrorCode())
                .build(),
                HttpStatus.NOT_FOUND
        );

    }
}
