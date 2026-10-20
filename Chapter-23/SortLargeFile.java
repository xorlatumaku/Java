import java.io.*;

public class SortLargeFile {
  public static final int MAX_ARRAY_SIZE = 100_000;
  public static final int  BUFFER_SIZE = 100_000;

  public static void main(String[] args) throws Exception {
    // Sort largedata.dat to sortedfile.dat
    sort("largedata.dat", "sortedfile.dat");
  }
}
