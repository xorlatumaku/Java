public class GenericSort {
  public static void main(String[] args) {
    // Create an Integer array
    Integer[] intArray = {Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(3)};

    // Create a Double array
    Double[] doubleArray = {Double.valueOf(3.4), Double.valueOf(1.3), Double.valueOf(-22.1)};

    // Create a Character array
    Character[] charArray = {Character.valueOf('a'), Character.valueOf('J'), Character.valueOf('r')};

    // Create a String array
    String[] stringArray = {"Tom", "Susan", "Kim"};
  }

  /* Sort an array of comparable objects */
  public static <E extends Comparable<E>> void sort(E[] list) {
    E currentMin;
    int currentMinIndex;

    for (int i = 0; i < list.length - 1; i++) {
      // Find the mininum in the list[i+1..list.length-2]
      currentMin = list[i];
      currentMinIndex = i;
    }
  }
}
