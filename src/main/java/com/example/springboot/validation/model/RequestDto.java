package com.example.springboot.validation.model;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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
    @Past(message = "time_marches_on")
    private LocalDateTime registerDateTime;
    @PastOrPresent(message = "time_marches_on")
    private LocalDate lastLoginDate;
    @Future(message = "are_you_already")
    private LocalDate retirementDate;
    @FutureOrPresent(message = "kinda_stack_over_flow_exception")
    private LocalDateTime expireDateTime;
    @Positive(message = "doable_this_action_on_earth_only")
    private Integer gravity;
    @PositiveOrZero(message = "consider_current_science_without_max_limit")
    private BigDecimal temperatureKelvin;
    @Negative(message = "nice_try")
    private BigDecimal temperatureCelsius;
    @NegativeOrZero(message = "look_what_you_did")
    private Integer loss;
    @Size(min = 0, max = 5, message = "big_family_to_register")
    private List<String> relations;
    @Size(min = 3, max = 30, message = "chinese_or_german_probably")
    private String bestRelationName;
    @Pattern(regexp = "\\D{2}\\d{19}", message = "two_non_digits_and_nineteen_digits")
    private String identity;
    @Digits(integer = 1, fraction = 2, message = "can_be_the_first_thing_you_imagined")
    private BigDecimal piNumber;
    @AssertTrue(message = "let_us_make_money")
    private Boolean approveGdpr;
    @AssertFalse(message = "go_away_trinity")
    private Boolean isHacker;
}
