package com.example.springboot.validation.controller;

import com.example.springboot.validation.model.RequestDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WebController {
    @PostMapping("register")
    public HttpStatus getData(@Valid @RequestBody RequestDto request) {
        return HttpStatus.OK;
    }
}
