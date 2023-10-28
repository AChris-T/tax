package com.dufuna.berlin.akinfenwa.tax.taxController;

import com.dufuna.berlin.akinfenwa.tax.service.TaxServiceImp;

public class TaxController {

    public static void main(String[] args) {
        TaxServiceImp service = new TaxServiceImp();
        double taxincome = service.taxCalculator(20000);
        System.out.println(taxincome);
    }
}