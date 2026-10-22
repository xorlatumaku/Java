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

  /* Return the head element in the list */
  public E getFirst() {
    if (size == 0) {
      return null;
    }
    else {
      return head.element;
    }
  }

  /* Return the last element in the list */
  public E getLast() {
    if (size == 0) {
      return null;
    }
    else {
      return tail.element;
    }
  }

  /* Add an element to the beginning of the list */
  public void addFirst(E e) {
    Node<E> newNode = new Node<>(e);  // Create a new node
    newNode.next = head;  // link the new node with the head
    head = newNode;   // head points to the new node
    size++; // Increase list size

    if (tail == null) // The new node is the only node in list
      tail = head;
  }

  /* Add an element to the end of the list */
  public void addLast(E e) {
    Node<E> newNode = new Node<>(e);  // Create a new node for e
    
    if (tail == null) {
      head = tail = newNode;  // The only node in list
    }
  }
}
