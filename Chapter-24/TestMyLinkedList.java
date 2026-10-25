public class TestMyLinkedList {
  /* Main method */
  public static void main(String[] args) {
    // Create a list for strings
    MyLinkedList<String> list = new MyLinkedList<>();

    // Add elements to the list
    list.add("Denmark");  // Add it to the list
    System.out.println("(1) " + list);

    list.add(0, "Finland");  // Add it to the beginning of the list
    System.out.println("(2) " + list);

    list.add("Greenland");   // Add it to the end of the list
    System.out.println("(3) " + list);

    list.addLast("Sweden");  // Add it to the end of the list
    System.out.println("(4) " + list);
  }
}
