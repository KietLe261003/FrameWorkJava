package com.example.TestFramework.base_exception;

import com.example.TestFramework.dto.response.apiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class globalException {
    @ExceptionHandler(value = RuntimeException.class)
    ResponseEntity<apiResponse> runtimeExceptionHandler(RuntimeException e) {
        apiResponse res = new apiResponse();
        res.setCode(500);
        res.setMessage(e.getMessage());
        res.setData("");
        return ResponseEntity.status(500).body(res);
    }
}
