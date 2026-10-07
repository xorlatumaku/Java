public class AnyWildCardDemo {
  public static void main(String[] args) {
    GenericStack<Integer> intStack = new GenericStack<>();
    intStack.push(1);
    intStack.push(2);
    intStack.push(-2);

    print(intStack);
  }
}
