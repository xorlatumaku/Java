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
    else {
      tail.next = newNode;  // Link the new node with the last node
      tail = newNode;       // tail now points to the last node
    }

    size++;   // Increase size
  }

  @Override /* Add a new element at the specified index in this list.
  * The index of the head element is 0 */
  public void add(int index, E e) {
     if (index == 0) addFirst(e);  // Insert first
     else if (index >= size) addLast(e);  // Insert last
     else { // Insert in the middle
        Node<E> current = head;
     for (int i = 1; i < index; i++)
       current = current.next;
     Node<E> temp = current.next;
     current.next = new Node<>(e);
     (current.next).next = temp;
     size++;
    }
  }

  /* Remove the head node and return the object that is contained in the removed node. */
  public E removeFirst() {
    if (size == 0) return null; // Nothing to delete
    else {
      Node<E> temp = head;  // Keep the first node temporarily
      head = head.next;     // Move head to point to next node
      size--;               // Reduce size by 1
      if (head == null) tail = null;  // List becomes empty
          return temp.element;        // Return the deleted element
    }
  }

  /* Remove the last node and return the object that is contained in the removed node. */
  public E removeLast() {
    if (size == 0 || size == 1) {
      return removeFirst();
    }
    else {
      Node<E> current = head;
      for (int i = 0; i < size - 2; i++) {
        current = current.next;
      }

      E temp = tail.element;
      tail = current;
      tail.next = null;
      size--;
      return temp;
    }
  }

  @Override /* Override toString() to return elements in the list */
  public String toString() {
    StringBuilder result = new StringBuilder("[");

    Node<E> current = head;
    for (int i = 0; i < size; i++) {
      result.append(current.element);
      current = current.next;
      if (current != null) {
        result.append(", ");  // Separate two elements with a coma
      }
      else {
        result.append("]");   // Insert the closing ] in the string
      }
    }

    return result.toString();
  }

  @Override /* Clear the list */
  public void clear() {
    size = 0;
    head = tail = null;
  }

  @Override /* Return true if this list contains the element e */
  public boolean contains(Object e) {
    Node<E> current = head;
    while (current != null) {
      if ((e == null && current.element == null) || (e != null && e.equals(current.element))) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  @Override /* Return the element at the specified index */
  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    Node<E> current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    return current.element;
  }

  @Override /* Return the index of the first matching element in this list. Return -1 if no match. */
  public int indexOf(Object e) {
    Node<E> current = head;
    for (int i = 0; i < size; i++) {
      if ((e == null && current.element == null) || (e != null && e.equals(current.element))) {
        return i;
      }
      current = current.next;
    }
    return -1;
  }

  @Override /* Return the index of the last matching element in this list. Return -1 if no match. */
  public int lastIndexOf(E e) {
    int lastIndex = -1;
    Node<E> current = head;
    for (int i = 0; i < size; i++) {
      if ((e == null && current.element == null) || (e != null && e.equals(current.element))) {
        lastIndex = i;
      }
      current = current.next;
    }
    return lastIndex;
  }

  @Override /* Replace the element at the specified position in this list with the specified element. */
  public E set(int index, E e) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    Node<E> current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }

    E oldElement = current.element;
    current.element = e;
    return oldElement;
  }
  
  @Override /* Remove the element at the specified position in this list
   * Shift any subsequent elements to the left.
   * Return the element that was removed from the list. */
  public E remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    
    if (index == 0) {
      return removeFirst();
    } 
    else if (index == size - 1) {
      return removeLast();
    } 
    else {
      Node<E> previous = head;
      for (int i = 1; i < index; i++) {
        previous = previous.next;
      }
      
      Node<E> current = previous.next;
      previous.next = current.next;
      size--;
      return current.element;
    }
  }

  @Override
  public boolean retainAll(java.util.Collection<?> c) {
    boolean changed = false;
    Node<E> current = head;
    int index = 0;
    
    while (current != null) {
      Node<E> nextNode = current.next; // Keep track of next node before potential removal
      if (!c.contains(current.element)) {
        this.remove(index);
        changed = true;
        // Do not increment index because the next node shifts into the current index position
      } else {
        index++;
      }
      current = nextNode;
    }
    return changed;
  }

  @Override
  public boolean addAll(java.util.Collection<? extends E> c) {
    boolean changed = false;
    for (E element : c) {
      if (this.add(element)) {
        changed = true;
      }
    }
    return changed;
  }

  @Override
  public boolean removeAll(java.util.Collection<?> c) {
    boolean changed = false;
    for (Object element : c) {
      while (this.contains(element)) {
        this.remove(element);
        changed = true;
      }
    }
    return changed;
  }

  @Override
  public boolean containsAll(java.util.Collection<?> c) {
    for (Object element : c) {
      if (!this.contains(element)) {
        return false;
      }
    }
    return true;
  }


  @Override /* Override iterator() defined in Iterable */
  public java.util.Iterator<E> iterator() {
    return new LinkedListIterator();
  }

  private class LinkedListIterator implements java.util.Iterator<E> {
    private Node<E> current = head; // Current index

    @Override
    public boolean hasNext() {
      return (current != null);
    }

    @Override
    public E next() {
      E e = current.element;
      current = current.next;
      return e;
    }

    @Override
    public void remove() {
      if (current == head) {
        throw new IllegalStateException("next() has not been called yet");
      }
      
      // Since current points to the NEXT node, the item to remove is right before it
      Node<E> targetNode = head;
      while (targetNode != null && targetNode.next != current) {
        targetNode = targetNode.next;
      }
      
      if (targetNode == null) {
        throw new IllegalStateException("Element already removed or invalid state");
      }
      
      // Remove the targetNode by finding its position in the list
      MyLinkedList.this.remove(targetNode.element);
    }
  }

  private static class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
      this.element = element;
    }
  }

  @Override /* Return the number of elements in this list */
  public int size() {
    return size;
  }
}
