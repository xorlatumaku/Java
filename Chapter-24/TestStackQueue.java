public class TestStackQueue {
  public static void main(String[] args) {
    // Create a stack
    GenericStack<String> stack = new GenericStack<>();

    // Add elements to the stack
    stack.push("Matt Damon");  // Push Matt Damon to the stack
    System.out.println("(1) " + stack);
  }
}
