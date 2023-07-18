package com.ranjan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
public class StudentDetails {


    private BigInteger id;
    private String firstName;
    private String lastName;
    private String state;
    private String emailId;
}
