package com.example.springboot.validation.exception;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.List;

@ControllerAdvice
@RequiredArgsConstructor
@Slf4j
public class GlobalExceptionHandler {
    private final HttpServletRequest httpServletRequest;

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<ErrorResponseDto> validationException(MethodArgumentNotValidException ex) {

        List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(error -> (error.getField() + " : " + error.getDefaultMessage())).toList();

        ErrorResponseDto response = ErrorResponseDto.builder()
                .details(errors)
                .status(HttpStatus.BAD_REQUEST.value())
                .ipAddress(httpServletRequest.getRemoteAddr())
                .timestamp(LocalDateTime.now())
                .error("validation_error")
                .path(httpServletRequest.getRequestURI())
                .build();
        log.warn("Validation exception occurred : {}", response);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
