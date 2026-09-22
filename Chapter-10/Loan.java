public class Loan {
  private double name;
  private int  numberOfYears;
  private double loanAmount;
  private java.util.Date loanDate;

  // Default constructor
  public Loan() {
    this(2.5, 1, 1000);
  }

  // Construct a loan with specified annual interest rate, number of years, and loan amount
  public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }

  // Return annualInterestRate
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  // Set a new annualInterestRate
  public void getAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  // Return numberOfYears
  public int getNumberOfYears() {
    return numberOfYears;
  }
}
