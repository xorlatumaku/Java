public class TestPassArray {
  public static void main(String[] args) {
    int[] a = {1, 2};

    // Swap elements using the swap method
    System.out.println("Before invoking swap");
    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    swap(a[0], a[1]);
    System.out.println("After invoking swap");
    System.out.println("array is {" + a[0] + ", " + a[1] + "}");

    // Swap elements using the swapFirstTWoInArray method
    System.out.println("Before invoking swapFirstTWoInArray");
    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    swapFirstTWoInArray(a);
    System.out.println("After invoking swapFirstTWoInArray");
    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
  }

  // Swap two variables
  public static void swap(int num1, int num2) {
    int temp = num1;
        num1 = num2;
        num2 = temp;
  }
  
  // Swap the first two elements in the array
  public static void swapFirstTWoInArray(int[] array) {
    int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
  }
}
