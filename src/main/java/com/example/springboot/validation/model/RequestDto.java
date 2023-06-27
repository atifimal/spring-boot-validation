package com.example.springboot.validation.model;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestDto {
    @NotNull
    @NotEmpty
    @NotBlank
    private String name;
    @Email
    private String eMail;
    @Min(value = 1930, message = "you_are_too_old")
    @Max(value = 2015, message = "go_outside_and_play")
    private Integer yearOfBirth;

    @DecimalMin(value = "0.0", message = "stay_strong")
    @DecimalMax(value = "10.0", message = "too_shiny")
    private BigDecimal lifeScore;

}
