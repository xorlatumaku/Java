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

  /* Get the English name for the month */
  public static String getMonthName(int month) {
    String monthName = "";
    switch (month) {
      case 1: monthName= "January"; break;
      case 2: monthName= "February"; break;
      case 3: monthName= "March"; break;
      case 4: monthName= "April"; break;
      case 5: monthName= "May"; break;
      case 6: monthName= "June"; break;
      case 7: monthName= "July"; break;
      case 8: monthName= "August"; break;
      case 9: monthName= "September"; break;
      case 10: monthName= "October"; break;
      case 11: monthName= "November"; break;
      case 12: monthName= "December";
    }

    return monthName;
  }

  /* Print month body */
  public static void printMonthBody(int year, int month) {
    // Get start day of the week for the first date in the month
    int startDay = getStartDay(year, month);

    // Get number of days in the month
    int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
  }
}
