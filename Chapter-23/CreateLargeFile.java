import java.io.*;

public class CreateLargeFile {
  public static void main(String[] args) throws Exception {
    DataOutputStream output = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream("largedata.dat"));
  }
}
