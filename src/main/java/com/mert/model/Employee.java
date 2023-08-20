package com.mert.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName;
    @Size(max = 12, min = 2)
    private String lastName;
    @NotNull//thymeleaf accepts yyyy-MM-dd but local date mm-dd-yyyy
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @NotBlank
    @Email
    private String email;

    @NotBlank
 //   @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;


}
