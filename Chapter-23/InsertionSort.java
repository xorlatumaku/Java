public class InsertionSort {
  public static void insertionSort(int[] list) {
     // Method for sorting list
    for (int i = 1; i < list.length; i++) {
       /* insert list[i] into a sorted sublist [0..i-1]
       * so that list[0..i] is sorted */
      int currentElement = list[i];
      int k;
      for (k = i - 1; k >=0 && k > currentElement; k--) {
        list[k + 1] = list[k];
      }
      
      /* Insert currentElement into list[k + 1] */
      list[k + 1] = currentElement;
    }
  }
}
