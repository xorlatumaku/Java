public class TestMyHashSet {
  public static void main(String[] args) {
    // Create a MyHashSet
    java.util.Collection<String> set = new MyHashSet<>();
    set.add("Smith");
    set.add("Anderson");
    set.add("Lewis");
    set.add("Cook");
    set.add("Smith");

    System.out.println("Elements in set: " + set);
    System.out.println("Number of elements in set: " + set.size());
    System.out.println("Is Smith in set? " + set.contains("Smith"));
  }
}
