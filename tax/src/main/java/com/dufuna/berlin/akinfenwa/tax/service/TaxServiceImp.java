package com.dufuna.berlin.akinfenwa.tax.service;

import com.dufuna.berlin.akinfenwa.tax.model.TaxEntity;
import org.springframework.stereotype.Service;

@Service
public class TaxServiceImp implements TaxService{
    /**
     * An implementation of the tax service interface
     *
     */
    @Override
    public double taxCalculator(double income) {

        double taxRange = (TaxEntity.tax2 -(TaxEntity.tax1 + 1)) * TaxEntity.rate2;
        double taxRange2 = taxRange+(TaxEntity.tax3 -(TaxEntity.tax2 + 1)) * TaxEntity.rate3;
        double taxRange3 = taxRange2 + (TaxEntity.tax4 - (TaxEntity.tax3 + 1)) * TaxEntity.rate4;

        if (income <= TaxEntity.tax1){
            double currentTax = income * TaxEntity.rate1;
            System.out.println("Your Tax bracket is $"+ TaxEntity.tax1 + " and tax is $" + currentTax);
            return currentTax;
        }else if (income <= TaxEntity.tax2){
            double currentTax = taxRange + (income - TaxEntity.tax1) * TaxEntity.rate2;

            System.out.println("Your Tax bracket is $"+ TaxEntity.tax2 + " and outstanding tax is $" + taxRange + ". Your total tax is $" + currentTax);

            return currentTax;
        }else if (income <= TaxEntity.tax3){
            double currentTax = (income - TaxEntity.tax2) * TaxEntity.rate3;
            double totalTax = taxRange2 + currentTax;

            System.out.println("Your Tax bracket is $"+ TaxEntity.tax3 + " and outstanding tax is $" + taxRange2 + ". Your total tax is $" + totalTax);
            return totalTax;
        } else if (income <= TaxEntity.tax4){
            double currentTax = (income - TaxEntity.tax3) * TaxEntity.rate4;
            double totalTax = taxRange3 + currentTax;

            System.out.println("Your Tax bracket is $"+ TaxEntity.tax4 + " and outstanding tax is $" + taxRange3 + ". Your total tax is $" + totalTax);

            return totalTax;
        }
        double taxOwedRange5 = (taxRange3) + (income - (TaxEntity.tax4 + 1)) * TaxEntity.rate5;
        double currentTax = (income - TaxEntity.tax4) * TaxEntity.rate5;
        double totalTax = taxOwedRange5 + currentTax;
        System.out.println("Your Tax bracket is $"+ TaxEntity.tax4 + " and above, your outstanding tax is $" + taxOwedRange5 + ". Your total tax is $" + totalTax);

        return totalTax;
    }
}
