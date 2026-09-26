import java.util.ArrayList;

public class TestArrayList {
  public static void main(String[] args) {
    // Create a list to store cities
    ArrayList<String> cityList = new ArrayList<>();

    // Add some cities in the list
    cityList.add("London");
    // cityList now contains [London]
    cityList.add("Denver");
    // cityList now contains [London, Denver]
    cityList.add("Paris");
    // cityList now contains [London, Denver, Paris]
    cityList.add("Miami");
    // cityList now contains [London, Denver, Paris, Miami]
    cityList.add("Seoul");
    // cityList now contains [London, Denver, Paris, Miami, Seoul]
    cityList.add("Tokyo");
    // cityList now contains [London, Denver, Paris, Miami, Seoul, Tokyo]
    
    System.out.println("List size? " + cityList.size());
    System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
    System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
    System.out.println("Is the list empty? " + cityList.isEmpty());

    // Insert a new city at index 2
    cityList.add(2, "Xian");
    // Contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]

    // Remove a city from the list
    cityList.Remove("Miami");
    // Contains [London, Denver, Xian, Paris, Seoul, Tokyo]
  }
}
