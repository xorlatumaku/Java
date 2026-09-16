import java.util.Scanner;

public class PrintCalendar {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter year
    System.out.print("Enter full year (e.g., 2012): ");
    int year = input.nextInt();

    // Prompt the user to enter month
    System.out.print("Enter month as a number between 1 and 12: ");
    int month = input.nextInt();

    // Print calendar for the month of the year
    printMonth(year, month);
  }

  /* Print the calendar for a month in a year */ 
  public static void printMonth(int year, int month) {
    // Print the headings of the calendar
    printMonthTitle(year, month);

    // Print the body of the calendar
    printMonthBody(year, month);
  }

  /* Print the month title, e.g., March 2012 */ 
  public static void printMonthTitle(int year, int month) {
    System.out.println("        " + getMonthName(month) + " " + year);
    System.out.println("--------------------------------------------");
    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
  }
}
