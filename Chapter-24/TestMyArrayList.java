public class TestMyArrayList {
  public static void main(String[] args) {
    // Create a list
    MyList<String> list = new MyArrayList<>();

    // Add elements to the list
    list.add("America");  // Add it to the list
    System.out.println("(1) " + list);

    list.add(0, "Canada"); // Add it to the beginning of the list
    System.out.println("(2) " + list);
  }
}
