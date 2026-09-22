import java.util.Scanner;

public class TestLoanClass {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
  }

  // Enter annual interest rate
  System.out.print("Enter annual interest rate: ");
  double annualInterestRate = input.nextDouble();

  // Enter number of years
  System.out.print("Enter number of years as an integer: ");
  int numberOfYears = input.nextInt();

  // Enter loan amount
  System.out.print("Enter loan amount: ");
  double loanAmount = input.nextDouble();

  // Create a loan object
  Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

}
