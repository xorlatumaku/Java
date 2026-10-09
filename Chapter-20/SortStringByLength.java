public class SortStringByLength {
  public static void main(String[] args) {
    String[] cities = {"Atlanta", "Savannah", "New York", "Dallas"};
    java.util.Arrays.sort(cities, new MyComparator());
  }
}
