import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
  public static void main(String[] args) {
    Random random = new Random();
    int[] list = random.ints(200_000_000).toArray();

  }
}
