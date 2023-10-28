package com.dufuna.berlin.akinfenwa.tax.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaxServiceImpTest {
    private final TaxService service = new TaxServiceImp();
@Test
  void taxBelowtax1(){
    double expectedTax = 0.00;
    assertEquals(expectedTax,service.taxCalculator(17900));
}
@Test
    void taxAbovetax2(){
    int income = 39000;
    double expectedTax = 21446.485;
    assertEquals(expectedTax,service.taxCalculator(income));
}
@Test
    void taxAbovetax3(){
    double expectedTax = 57796.115;
    assertEquals(expectedTax,service.taxCalculator(100000));
}
@Test
    void taAbovetax4(){
    double expectedTax = 58595.665;
    assertEquals(expectedTax,service.taxCalculator(185000));
}
}