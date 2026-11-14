import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.util.stream.Stream;

public class CountKeywordStream {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Java source file: ");
    String filename = input.nextLine();

    File file = new File(filename);
    if (file.exists()) {
      System.out.println("The number of keywords in " + filename 
          + " is " + countKeywords(file));
    }
    else {
      System.out.println("File " + filename + " does not exist");
    }
  }


}
