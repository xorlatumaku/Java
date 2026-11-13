import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
  public static void main(String[] args) {
    String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
      "George", "Alan", "Stacy", "Michelle", "john"};

    System.out.println("The number of characters for all names: " +
        Stream.of(names).collect(StringBuilder::new,
          StringBuilder::append, StringBuilder::append).length());
  }
}
