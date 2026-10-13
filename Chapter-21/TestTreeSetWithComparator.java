import java.util.*;

public class TestTreeSetWithComparator {
  public static void main(String[] args) {
    // Create a tree set for geometric objects using a comparator
    Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
  }
}
