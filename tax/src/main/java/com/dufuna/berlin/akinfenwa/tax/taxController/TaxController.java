package com.dufuna.berlin.akinfenwa.tax.taxController;

import com.dufuna.berlin.akinfenwa.tax.dto.Request;
import com.dufuna.berlin.akinfenwa.tax.service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tax")
public class TaxController {

    @Autowired
    private  TaxService taxService;
    @GetMapping("")
    public Request taxCalculator(Request Request){
                return com.dufuna.berlin.akinfenwa.tax.dto.Request.builder()
                .income(Request.getIncome())
                .tax(taxService.taxCalculator(Request.getIncome()))
                .build();
    }

}