import java.util.Collection;

public interface MyList<E> extends Collection<E> {
  /* Add a new element at the specified index in this list */
  public void add(int index, E e);

  /* Return the element from this list at the specified index */
  public E get(int index);

  /* Return the index of the first matching element in this list.
   * Return -1 if no match. */
  public int indexOf(Object e);

  /* Return the index of the last matching element in this list.
   * Return -1 if no match. */
  public int lastIndexOf(E e);

  /* Remove the element at the specified position in this list
   * Shift any subsequent elements to the left.
   * Return the element that was removed from the list. */
  public E remove(int index);

  /* Replace the element at the specified position in this list
   * with the specified element and returns the new set. */
  public E set(int index, E e);

  @Override /* Add a new element at the end of this list */
  public default boolean add(E e) {
    add(size(), e);
    return true;
  }

  @Override /* Return true if this list contains no elements */
  public default boolean isEmpty() {
    return size() == 0;
  }

  @Override /* Remove the first occurrence of the element e 
  * from this list. Shift any subsequent elements to the left.
  * Return true if the element is removed. */
  public default boolean remove(Object e) {
    if (indexOf(e) >= 0) {
      remove(indexOf(e));
      return true;
    }
    else
      return false;
  }

  @Override /* Return true if this list contains all elements in the collection */
  public boolean containsAll(java.util.Collection<?> c) {
    for (Object e : c) {
      if (!this.contains(e)) {
        return false;
      }
    }
    return true;
  }
  
  @Override /* Add all elements in the collection to this list */
  public boolean addAll(java.util.Collection<? extends E> c) {
    if (c.isEmpty()) return false;

    for (E e : c) {
      add(size, e); // Appends to the end of the list
    }
    return true;
  }

  @Override /* Remove all elements in the collection from this list */
  public boolean removeAll(java.util.Collection<?> c) {
    boolean changed = false;
    // Iterate backwards so shifting doesn't skip elements
    for (int i = size - 1; i >= 0; i--) {
      if (c.contains(data[i])) {
        remove(i);
        changed = true;
      }
    }
    return changed;
  }

  @Override /* Return an array containing all elements in this list */
  public Object[] toArray() {
    Object[] result = new Object[size];
    System.arraycopy(data, 0, result, 0, size);
    return result;
  }
}
