import java.util.stream.Stream;

public class StreamDemo {
  public static void main(String[] args) {
    String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
      "George", "Alan", "Stacy", "Michelle", "john"};

    // Display the first four names sorted
    Stream.of(names).limit(4).sorted()
      .forEach(e -> System.out.print(e + " "));
  }
}
