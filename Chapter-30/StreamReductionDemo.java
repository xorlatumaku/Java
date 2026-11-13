import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReductionDemo {
  public static void main(String[] args) {
    int[] values = {3, 4, 1, 5, 20, 1, 3, 3, 4, 6};

    System.out.print("The values are ");
      IntStream.of(values).forEach(e -> System.out.print(e + " "));

    System.out.println("\nThe result of multiplying all values is " +
        IntStream.of(values).parallel(). reduce(1, (e1, e2) -> e1 * e2));

    System.out.print("The values are " +
        IntStream.of(values).mapToObj(e -> e + "")
          .reduce((e1, e2) -> e1 + ", " + e2).get());
  }
}
