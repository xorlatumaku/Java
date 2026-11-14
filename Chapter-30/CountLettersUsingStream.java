import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountLettersUsingStream {
  private static int count = 0;

  public static void main(String[] args) {
    Random random = new Random();
    Object[] chars = random.ints(100, (int)'a', (int)'z' + 1).
      mapToObj(e -> (char)e).toArray();
  }
}
