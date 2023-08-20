package com.mert.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

  private  String firstName;
  private  String lastName;

  //thymeleaf accepts yyyy-MM-dd but local date mm-dd-yyyy
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate birthday;
  private  String email;
  private  String password;
  private  String address;
  private  String address2;
  private  String city;
  private  String state;
  private  String zipCode;






}
