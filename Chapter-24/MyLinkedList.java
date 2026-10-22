public class MyLinkedList<E> implements MyList<E> {
  private Node<E> head, tail;
  private int size = 0; // Number of elements in the list

  /* Create an empty list */
  public MyLinkedList() {
  }

  /* Create a list from an array of objects */
  public MyLinkedList(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]);
  }
}
