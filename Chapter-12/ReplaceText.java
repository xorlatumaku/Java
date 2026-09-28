import java.io.*;
import java.util.*;

public class ReplaceText {
  public static void main(String[] args) throws Exception {
    // Check command line parameter usage
    if (args.length != 4) {
      System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
      System.exit(1);
    }
  }
}
