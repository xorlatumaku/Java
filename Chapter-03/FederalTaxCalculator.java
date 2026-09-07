import java.util.Scanner;

/** 
 * 2025 U.S. Federal Personal Income Tax Calculator
 * Computes tax owed using marginal tax brackets for four filing statuses:
 *   1. Single
 *   2. Married Filing Jointly (or Qualifying Widow(er))
 *   3. Married Filing Separately
 *   4. Head of Household
 *
 * Brackets reflect the 2025 IRS tax tables (tax year 2025, filed in 2026).
 */ 

public class FederalTaxCalculator {
  
  // Each bracket: { lowerBound, rate } -- rate as a decimal (0.10 = 10%)
  private static final double[][] SINGLE = {
    {0, 0.10}, {11925, 0.12}, {48475, 0.22}, {103350, 0.24},
    {197300, 0.32}, {250525, 0.35}, {626350, 0.37}
  };
  
  private static final double[][] MARRIED_JOINTLY = {
    {0, 0.10}, {23850, 0.12}, {96950, 0.22}, {206700, 0.24},
    {394600, 0.32}, {501050, 0.35}, {751600, 0.37}
  };

  private static final double[][] MARRIED_SEPARATELY = {
    {0, 0.10}, {11925, 0.12}, {48475, 0.22}, {103350, 0.24},
    {197300, 0.32}, {250525, 0.35}, {375800, 0.37}
  };

  private static final double[][] HEAD_OF_HOUSEHOLD = {
    {0, 0.10}, {17000, 0.12}, {64850, 0.22}, {103350, 0.24},
    {197300, 0.32}, {250500, 0.35}, {626350, 0.37}
  };

  public enum FilingStatus {
    SINGLE, MARRIED_JOINTLY, MARRIED_SEPARATELY, HEAD_OF_HOUSEHOLD
  }

  /**
   * Calculates federal tax owed using progressive marginal brackets.
   *
   * @param taxableIncome the taxable income (must be >= 0)
   * @param status        the filing status
   * @return total tax owed, rounded to the nearest cent
   */ 
  public static double calculateTax(double taxableIncome, FilingStatus status) {
     if (taxableIncome < 0) {
        throw new IllegalArgumentException("Taxable income cannot be negative.");
     }

     double[][] brackets = getBrackets(status);
     double tax = 0.0;

     for (int i = 0; i < brackets.length; i++) {
       double lowerBound = brackets[i][0];
       double rate = brackets[i][1];

       // Upper bound is the next bracket's lower bound, or infinity for the last one 
       double upperBound = (i + 1 < brackets.length) ? brackets[i + 1][0] : Double.POSITIVE_INFINITY;

       if (taxableIncome > lowerBound) {
         double incomeInBracket = Math.min(taxableIncome, upperBound) - lowerBound;
         tax += incomeInBracket * rate;
       } else {
          break;
       }
     }

     // Round to nearest cent
     return Math.round(tax * 100.0) / 100. 0;
   }

  /** Returns the effective (average) tax rate as a percentage. */
  public static double calculateEffectiveRate(double taxableIncome, double taxOwed) {
    if (taxableIncome == 0) return 0.0;
    return Math.round((taxOwed / taxableIncome) * 10000.0) / 100.0;
  }
}
