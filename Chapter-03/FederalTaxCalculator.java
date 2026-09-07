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
}
