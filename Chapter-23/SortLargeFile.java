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
    DataOutputStream output = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream(f1)));

    int numberOfSegments = 0;
    while (input.available() > 0) {
      numberOfSegments++;
      int i = 0;
      for ( ; input.available() > 0 && i < segmentSize; i++) {
        list[i] = input.readInt();
      }

      // Sort an array list[0..i-1]
      java.util.Arrays.sort(list, 0, i);

      // Write the array to f1.dat
      for (int j = 0; j < i; j++) {
        output.writeInt(list[j]);
      }
    }

    input.close();
    output.close();

    return numberOfSegments;
  }

  private static void merge(int numberOfSegments, int segmentSize,
      String f1, String f2, String f3, String targetfile) throws Exception {
    if (numberOfSegments > 1) {
      mergeOneStep(numberOfSegments, segmentSize, f1, f2, f3);
      merge((numberOfSegments + 1) / 2, segmentSize * 2, f3, f1, f2, targetfile);
    }
    else {  // Rename f1 as the final sorted file 
      File sortedFile = new File(targetfile);
      if (sortedFile.exists()) sortedFile.delete();
      new File(f1).renameTo(sortedFile);
    }
  }

  private static void mergeOneStep(int numberOfSegments, int segmentSize, String f1, String f2, String f3) throws Exception {
    DataInputStream f1Input = new DataInputStream(
        new BufferedInputStream(new FileInputStream(f1), BUFFER_SIZE));

    DataOutputStream f2Output = new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream(f2), BUFFER_SIZE));

    // Copy half number of segments from f1.dat to f2.dat
    copyHalfToF2(numberOfSegments, segmentSize, f1Input, f2Output);
  }
}
