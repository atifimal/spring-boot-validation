package com.example.springboot.validation.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponseDto implements Serializable {

    private static final long serialVersionUID = -7737122921024557000L;
    private String path;
    private String ipAddress;
    private int status;
    private String error;
    private List<String> details;
    private LocalDateTime timestamp;

}
