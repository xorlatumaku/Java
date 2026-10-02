import java.io.*;

public class TestFileStream {
  public static void main(String[] args) throws IOException {
    try (
        // Create an output stream to the file
        FileOutputStream output = new FileOutputStream("temp.dat");
        ) {
          // Output values to the file
          for (int i = 1; i <= 10; i++)
            output.write(i);
    }
  }
}
