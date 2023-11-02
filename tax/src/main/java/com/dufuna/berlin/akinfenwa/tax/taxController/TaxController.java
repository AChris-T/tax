package com.dufuna.berlin.akinfenwa.tax.taxController;

import com.dufuna.berlin.akinfenwa.tax.dto.Request;
import com.dufuna.berlin.akinfenwa.tax.service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/tax")
public class TaxController {

    @Autowired
    private  TaxService taxService;
    
    @PostMapping()
    @RolesAllowed({"user","admin"})
    public Request taxCalculator(@RequestBody Request Request){
                return com.dufuna.berlin.akinfenwa.tax.dto.Request.builder()
                .income(Request.getIncome())
                .tax(taxService.taxCalculator(Request.getIncome()))
                .build();
    }

}