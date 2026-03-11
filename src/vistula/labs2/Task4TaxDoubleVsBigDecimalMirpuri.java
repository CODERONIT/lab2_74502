package vistula.labs2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task4TaxDoubleVsBigDecimalMirpuri {


    static double netPriceDoubleMirpuri = 9.99;
    static double vatRateDoubleMirpuri = 0.23;
    static double vatMultiplierDoubleMirpuri = 1.0 + vatRateDoubleMirpuri;

    static double grossPriceDoubleMirpuri;
    static double totalGrossDoubleMirpuri;
    static double totalNetBackDoubleMirpuri;


    static BigDecimal netPriceBdMirpuri = new BigDecimal("9.99");
    static BigDecimal vatMultiplierBdMirpuri = new BigDecimal("1.23");
    static BigDecimal quantityBdMirpuri = new BigDecimal("10000");

    static BigDecimal grossPriceBdMirpuri;
    static BigDecimal totalGrossBdMirpuri;
    static BigDecimal totalNetBackBdMirpuri;

    public static void main(String[] args) {
        System.out.println("TASK 4 — HOW NOT TO CALCULATE THE TAX IN JAVA");

        // ===== double calculations =====
        System.out.println("\n--- Using double ---");
        grossPriceDoubleMirpuri = netPriceDoubleMirpuri * vatMultiplierDoubleMirpuri;
        totalGrossDoubleMirpuri = grossPriceDoubleMirpuri * 10000;
        totalNetBackDoubleMirpuri = totalGrossDoubleMirpuri / vatMultiplierDoubleMirpuri;

        System.out.printf("Net (double) = %.20f%n", netPriceDoubleMirpuri);
        System.out.printf("Gross per item (double) = %.20f%n", grossPriceDoubleMirpuri);
        System.out.printf("Total gross for 10,000 (double) = %.20f%n", totalGrossDoubleMirpuri);
        System.out.printf("Total net back-calculated (double) = %.20f%n", totalNetBackDoubleMirpuri);

        // ===== BigDecimal calculations =====
        System.out.println("\n--- Using BigDecimal ---");
        grossPriceBdMirpuri = netPriceBdMirpuri.multiply(vatMultiplierBdMirpuri)
                .setScale(2, RoundingMode.HALF_UP);

        totalGrossBdMirpuri = grossPriceBdMirpuri.multiply(quantityBdMirpuri)
                .setScale(2, RoundingMode.HALF_UP);

        totalNetBackBdMirpuri = totalGrossBdMirpuri.divide(vatMultiplierBdMirpuri, 10, RoundingMode.HALF_UP);

        System.out.println("Net (BigDecimal) = " + netPriceBdMirpuri);
        System.out.println("Gross per item (BigDecimal) = " + grossPriceBdMirpuri);
        System.out.println("Total gross for 10,000 (BigDecimal) = " + totalGrossBdMirpuri);
        System.out.println("Total net back-calculated (BigDecimal) = " + totalNetBackBdMirpuri);

        // ===== conclusions =====
        System.out.println("\n--- Conclusions ---");
        System.out.println("- double is binary floating-point, so 9.99 cannot be stored exactly -> small errors appear.");
        System.out.println("- BigDecimal (created from String) keeps decimal precision and is recommended for money.");
    }
}
