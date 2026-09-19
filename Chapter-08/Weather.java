import java.util.Scanner;

public class Weather {
  public static void main(String[] args) {
    final int NUMBER_OF_DAYS = 10;
    final int NUMBER_OF_HOURS = 24;
    double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

    Scanner input = new Scanner(System.in);
    // Read input using input redirection from a file
    for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
      int day = input.nextInt();
      int hour = input.nextInt();
      double temperature = input.nextDouble();
      double humidity = input.nextDouble();
      data[day - 1][hour - 1][0] = temperature;
      data[day - 1][hour - 1][1] = humidity;
    }
  }
}
