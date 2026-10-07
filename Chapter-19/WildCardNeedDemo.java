public class WildCardNeedDemo {
  public static void main(String[] args) {
    GenericStack<Integer> intStack = new GenericStack<>();
    intStack.push(1); // 1 is autoboxed into an Integer object
    intStack.push(2);
    intStack.push(-2);

    System.out.print("The max number is " + max(intStack));
  }
}
