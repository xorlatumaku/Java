import java.io.*;

public class SortLargeFile {
  public static final int MAX_ARRAY_SIZE = 100_000;
  public static final int  BUFFER_SIZE = 100_000;

  public static void main(String[] args) throws Exception {
    // Sort largedata.dat to sortedfile.dat
    sort("largedata.dat", "sortedfile.dat");

    // Display the first 100 numbers in the sorted file
    displayFile("sortedfile.dat");
  }

  /* Sort data in source file and into target file */
  public static void sort(String sourcefile, String targetfile) throws Exception {
    // Implement Phase 1: Create initial segments
    int numberOfSegments = initializeSegments(MAX_ARRAY_SIZE, sourcefile, "f1.dat");

    // Implement Phase 2: Merge segments recursively
    merge(numberOfSegments, MAX_ARRAY_SIZE, "f1.dat", "f2.dat", "f3.dat", targetfile);
  }

  /* Sort original file into sorted segments */
  private static int initializeSegments(int segmentSize, String originalFile, String f1) throws Exception {
    int[] list = new int[segmentSize];
    DataInputStream input = new DataInputStream(
        new BufferedInputStream(new FileInputStream(originalFile)));
  }
}
