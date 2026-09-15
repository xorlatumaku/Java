public class FutureTuition {
  public static void main(String[] args) {
    double tuition = 80000;
    int year = 0;
    while (tuition < 160000) {
      tuition = tuition * 1.07;
      year++;
    }

    System.out.println("Tuition will be doubled in " + year + " years");
    System.out.printf("Tuition will be $%.2f in %1d years\n", tuition, year);
  }
}
