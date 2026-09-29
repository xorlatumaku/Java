import java.util.Scanner;
import java.util.ArrayList;

public class WebCrawler {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a URL: ");
    String url = input.nextLine();
    crawler(url);   // Traverse the Web from the a starting url
  }

  public static void crawler(String startingURL) {
    ArrayList<String> listOfPendingURLs = new ArrayList<>();
    ArrayList<String> listOfTraversedURLs = new ArrayList<>();
    listOfPendingURLs.add(startingURL);
    while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {
      String urlString = listOfPendingURLs.remove(0);
      if (!listOfTraversedURLs.contains(urlString)) {
        listOfTraversedURLs.add(urlString);
        System.out.println("Crawl " + urlString);
      }
    }
  }
}
