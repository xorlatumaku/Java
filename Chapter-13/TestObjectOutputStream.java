import java.io.*;

public class TestObjectOutputStream {
  public static void main(String[] args) throws IOException {
    try ( // Create an output stream for file object.dat
      ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));

        ) {
      
    } catch (Exception e) {
      //TODO: handle exception
    }
  }
}
