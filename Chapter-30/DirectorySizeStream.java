import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class DirectorySizeStream {
  public static void main(String[] args) throws Exception {
    // Prompt the user to enter a directory or a file
    System.out.print("Enter a directory or a file: ");
    Scanner input = new Scanner(System.in);
    String directory = input.nextLine();

    // Display the size
    System.out.println(getSize(new File(directory)) + " bytes");
  }
}
