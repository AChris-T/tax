package com.dufuna.berlin.akinfenwa.tax.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TaxEntity {
    public static final int tax1 = 18200;
    public static final int tax2 = 37000;
    public static final int tax3 = 90000;
    public static final int tax4 = 180000;

    public static final double rate1 = 0.00;
    public static final double rate2 = 0.19;
    public static final double rate3 = 0.325;
    public static final double rate4 = 0.37;
    public static final double rate5 = 0.45;
}
