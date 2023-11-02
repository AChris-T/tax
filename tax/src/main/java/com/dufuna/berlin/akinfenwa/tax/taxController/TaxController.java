package com.dufuna.berlin.akinfenwa.tax.taxController;

import com.dufuna.berlin.akinfenwa.tax.service.TaxServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/tax")
public class TaxController {

    private final TaxServiceImp taxServiceImp;
    @Autowired
    public TaxController(TaxServiceImp taxServiceImp) {
        this.taxServiceImp = taxServiceImp;
    }

    @GetMapping()
    @RolesAllowed({"user","admin"})
    @ResponseStatus(HttpStatus.OK)
    public double taxCalculator(@RequestParam double income){
        return taxServiceImp.taxCalculator(income);
    }

}