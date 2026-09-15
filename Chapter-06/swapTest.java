public class TestPassByValue {
  public static void main(String[] args) {
    // Declare and initialize variables
    int num1 = 1;
    int num2 = 2;

    System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);

    // Invoke the swap method to attempt to swap two variables
    swap(num1, num2);

    System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
  }

  /** Swap two variables */ 
  public static void swap(int x, int y) {
    System.out.println("\tInside the swap method");
    System.out.println("\t\tBefore swapping, x is " + x + " and y is " + y);

    // Swap x with y 
    int temp = x;
        x = y;
        y = temp;

    System.out.println("\t\tAfter swapping, x is " + x + " and y is " + y);
  }
}
