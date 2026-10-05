public class RecursiveBinarySearch {
  public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;
    return binarySearch(list, key, low, high);
  }

  private static int binarySearch(int[] list, int key, int low, int high) {
    if (low > high) // The list has been exhausted without a match
      return - low - 1;
      
  }
}
