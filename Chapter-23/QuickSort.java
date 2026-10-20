public class QuickSort {
  public static void quickSort(int[] list) {
    quickSort(list, 0, list.length - 1);
  }

  public static void quickSort(int[] list, int first, int last) {
    if (last > first) {
      int pivotIndex = partition(list, first, last);
      quickSort(list, first, pivotIndex - 1);
      quickSort(list, pivotIndex + 1, last);
    }
  }
}
