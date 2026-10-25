public class TestStackQueue {
  public static void main(String[] args) {
    // Create a stack
    GenericStack<String> stack = new GenericStack<>();

    // Add elements to the stack
    stack.push("Matt Damon");  // Push Matt Damon to the stack
    System.out.println("(1) " + stack);

    stack.push("Tom Holland");  // Push Tom Holland to the stack
    System.out.println("(2) " + stack);

    stack.push("Anne Hathaway");  // Push Anne Hathaway to the stack
    stack.push("Zendaya");    // Push Zendaya to the stack
    System.out.println("(3) " + stack);

    // Remove elements from the stack
    System.out.println("(4) " + stack.pop());
    System.out.println("(5) " + stack.pop());
    System.out.println("(6) " + stack);

    // Create a queue
    GenericQueue<String> queue = new GenericQueue<>();

    // Add elements to the queue
    queue.enqueue("Robert Pattinson");  // Add Robert Pattinson to the queue
    System.out.println("(7) " + queue);

    queue.enqueue("Benny Safdie");    // Add Benny Safdie to the queue
    System.out.println("(8) " + queue);

    queue.enqueue("Jon Bentral");    // Add Jon Bentral to the queue
      }
}
