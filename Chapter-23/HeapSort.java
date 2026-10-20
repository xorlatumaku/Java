import java.util.Comparator;

public class HeapSort {
  /* Heap sort method */
  public static <E> void heapSort(E[] list) {
    // Create a Heap of integers
    heapSort(list, (e1, e2) -> ((Comparable<E>)e1).compareTo(e2));
  }
}
