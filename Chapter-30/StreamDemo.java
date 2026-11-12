import java.util.stream.Stream;

public class StreamDemo {
  public static void main(String[] args) {
    String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
      "George", "Alan", "Stacy", "Michelle", "john"};

    // Display the first four names sorted
    Stream.of(names).limit(4).sorted()
      .forEach(e -> System.out.print(e + " "));

    // Skip four names and display the rest sorted ignore case
    System.out.println();
    Stream.of(names).skip(4)
      .sorted((e1, e2) -> e1.compareToIgnoreCase(e2))
      .forEach(e -> System.out.print(e + " "));

    System.out.println();
    Stream.of(names).skip(4)
      .sorted(String::compareToIgnoreCase)
      .forEach(e -> System.out.print(e + " "));
  }
}
