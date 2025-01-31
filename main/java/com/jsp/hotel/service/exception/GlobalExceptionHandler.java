package com.jsp.hotel.service.exception;

import com.jsp.hotel.service.data.dto.ApiResponse;
import com.jsp.hotel.service.util.ResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException e){
        return ResponseUtil.getNotFoundResponse(e.getMessage());
    }
}