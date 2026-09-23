public class StackOfIntegers {
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 16;

  // Construct a stack with the default capacity 16
  public StackOfIntegers() {
    this(DEFAULT_CAPACITY);
  }

  // Construct a stack with the specified capacity
  public StackOfIntegers(int capacity) {
    elements = new int[capacity];
  }
}
