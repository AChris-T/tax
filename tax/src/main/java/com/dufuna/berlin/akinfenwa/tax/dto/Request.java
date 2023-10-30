package com.dufuna.berlin.akinfenwa.tax.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    private int income= Integer.parseInt("50000");
    private double tax = Integer.parseInt("5000");
}

