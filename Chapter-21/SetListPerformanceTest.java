import java.util.*;

public class SetListPerformanceTest {
  static final int N = 50000;

  public static void main(String[] args) {
    // Add numbers 0, 1, 2, ..., N - 1 to the array list
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < N; i++)
      list.add(i);
    Collections.shuffle(list);  // Shuffle the array list
  }
}
