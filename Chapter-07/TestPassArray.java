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
}
