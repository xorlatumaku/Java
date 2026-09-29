import java.util.ArrayList;
import java.math.*;

public class LargestNumber {
  public static void main(String[] args) {
    ArrayList<Number> list = new ArrayList<>();
    
    list.add(45); // Add an integer
    list.add(3445.53); // Add a double

    list.add(new BigInteger("3432323234344343101"));  // Add a BigInteger
  }
}
