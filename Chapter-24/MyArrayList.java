public class MyArrayList<E> implements MyList<E> {
  public static final int INITIAL_CAPACITY = 16;
  private E[] data = (E[]) new Object[INITIAL_CAPACITY];
  private int size = 0; // Number of elements in the list

  /* Create an empty list */
  public MyArrayList() {
  }

  /* Create a list from an array of objects */
  public MyArrayList(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]);
  }
}
