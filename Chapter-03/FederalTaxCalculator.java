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
     return Math.round(tax * 100.0) / 100.0;
   }

  /** Returns the effective (average) tax rate as a percentage. */
  public static double calculateEffectiveRate(double taxableIncome, double taxOwed) {
    if (taxableIncome == 0) return 0.0;
    return Math.round((taxOwed / taxableIncome) * 10000.0) / 100.0;
  }

  /* Returns the marginal (top) tax rate that applies to the given income. */
  public static double getMarginalRate(double taxableIncome, FilingStatus status) {
    double[][] brackets = getBrackets(status);
    double rate = brackets[0][1];
    for (double[] bracket : brackets) {
        if (taxableIncome >= bracket[0]) {
          rate = bracket[1];
        } else {
            break;
        }
    }
    return rate * 100.0;
  }

  private static double[][] getBrackets(FilingStatus status) {
    switch (status) {
      case SINGLE:
        return SINGLE;
      case MARRIED_JOINTLY:
        return MARRIED_JOINTLY;
      case MARRIED_SEPARATELY:
        return MARRIED_SEPARATELY;
      case HEAD_OF_HOUSEHOLD:
        return HEAD_OF_HOUSEHOLD;
      default:
        throw new IllegalArgumentException("Unknown filing status: " + status);
    }
  }

  private static String statusLabel(FilingStatus status) {
    switch (status) {
      case SINGLE: return "Single";
      case MARRIED_JOINTLY: return "Married Filing Jointly / Qualifying Widow(er)";
      case MARRIED_SEPARATELY: return "Married Filing Separately";
      case HEAD_OF_HOUSEHOLD: return "Head of Household";
      default: return "Unknown";
    }
  }

  private static void printBreakdown(double taxableIncome, FilingStatus status) {
    double[][]  brackets = getBrackets(status);
    System.out.println("\nBracket-by-bracket breakdown:");
    System.out.printf("%-25s %-10s %-15s%n", "Income Range", "Rate", "Tax in Bracket");
    System.out.println("-----------------------------------------------------------");

    for (int i = 0; i < brackets.length; i++) {
      double lowerBound = brackets[i][0];
      double rate = brackets[i][1];
      double upperBound = (i + 1 < brackets.length) ? brackets[i + 1][0] : Double.POSITIVE_INFINITY;

      if (taxableIncome <= lowerBound) break;

      double incomeInBracket = Math.min(taxableIncome, upperBound) - lowerBound;
      double taxInBracket = Math.round(incomeInBracket * rate * 100.0) / 100.0;

      String rangeStr = (upperBound == Double.POSITIVE_INFINITY)
              ? String.format("$%,.0f and up", lowerBound)
              : String.format("$%,.0f - $%,.0f", lowerBound, upperBound);

      System.out.printf("%-25s %-10s $%,.2f%n", rangeStr, (int) (rate * 100) + "%", taxInBracket);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== 2025 U.S. Federal Income Tax Calculator ===\n");
    System.out.println("Select filing status:");
    System.out.println("  1. Single");
    System.out.println("  2. Married Filing Jointly / Qualifying Widow(er)");
    System.out.println("  3. Married Filing Separately");
    System.out.println("  4. Head of Household");
    System.out.print("Enter choice (1-4): ");

    int choice = readIntInRange(scanner, 1, 4);

    FilingStatus status;
    switch (choice) {
      case 1: status = FilingStatus.SINGLE; break;
      case 2: status = FilingStatus.MARRIED_JOINTLY; break;
      case 3: status = FilingStatus.MARRIED_SEPARATELY; break;
      case 4: status = FilingStatus.HEAD_OF_HOUSEHOLD; break;
      default: status = FilingStatus.SINGLE; // unreachable
    }

    System.out.print("\nEnter taxable income ($): ");
    double taxableIncome = readNonNegativeDouble(scanner);

    double tax = calculateTax(taxableIncome, status);
    double effectiveRate = calculateEffectiveRate(taxableIncome, tax);
    double marginalRate = getMarginalRate(taxableIncome, status);

    System.out.println("\n=== Results ===");
    System.out.println("Filing Status:   " + statusLabel(status));
    System.out.printf("Taxable Income:    $%,.2f%n", taxableIncome);
    System.out.printf("Federal Tax Owed: $%,.2f%n", tax);
    System.out.printf("Marginal Tax Rate: %.0f%%%n", marginalRate);
    System.out.printf("Effective Tax Rate: %.2f%%%n", effectiveRate);

    printBreakdown(taxableIncome, status);

    scanner.close();
  }

  private static int readIntInRange(Scanner scanner, int min, int max) {
    while (true) {
      String input = scanner.nextLine().trim();
      try {
          int value = Integer.parseInt(input);
          if (value >= min && value <= max) return value;
      } catch (NumberFormatException ignored) {
          // fall through to error message
      }
      System.out.print("Invalid choice. Enter a number between " + min + " and " + max + ": ");
    }
  }

  private static double readNonNegativeDouble(Scanner scanner) {
    while (true) {
      String input = scanner.nextLine().trim().replace(",", "").replace("$", "");
      try {
          double value = Double.parseDouble(input);
          if (value >= 0) return value;
      } catch (NumberFormatException ignored) {
          // fall through to error message
      }
      System.out.print("Invalid amount. Enter a non-negative number: ");
    }
  }
}
