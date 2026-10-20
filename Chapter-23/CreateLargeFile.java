import java.io.*;

public class CreateLargeFile {
  public static void main(String[] args) throws Exception {
    DataOutputStream output = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream("largedata.dat"));
    for (int i = 0; i < 2_000_000; i++)
      output.writeInt((int)(Math.random() * 1_000_000)));

    output.close();
  }
}
