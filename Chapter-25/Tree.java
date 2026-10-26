import java.util.Collection;

public interface Tree<E> extends Collection<E> {
  /* Return true if the element is in the tree */
  public boolean search(E e);

  /* Insert element e into the binary tree
   * Return true if the element is inserted successfully */
  public boolean insert(E e);

  /* Delete the specified element from the tree
   * Return true if the element is deleted successfully */
  public boolean delete(E e);

  /* Get the number of elements in the tree */
  public int getSize();

  /* Inorder traversal from the root */
  public default void inorder() {
  }

  /* Postorder traversal from the root */
  public default void postorder() {
  }

  /* Preorder traversal from the root */
  public default void preorder() {
  }

  @Override /* Return true if the tree is empty */
  public default boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public default boolean contains(Object e) {
    return search((E)e);
  }
  
  @Override
  public default boolean add(E e) {
    return insert(e);
  }

  @Override
  public default boolean remove(Object e) {
    return delete((E)e);
  }

  @Override
  public default int size() {
    return getSize();
  }

  @Override
  public default boolean containsAll(Collection<?> c) {
    for (Object e : c) {
      if (!contains(e)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public default boolean addAll(Collection<? extends E> c) {
    boolean modified = false;
    for (E  e : c) {
      if (add(e)) {
        modified = true;
      }
    }
    return modified;
  }

  @Override
  public default boolean removeAll(Collection<?> c) {
    boolean modified = false;
    for (Object e : c) {
      if (remove(e)) {
        modified = true;
      }
    }
    return modified;
  }

  @Override
  public default boolean retainAll(Collection<?> c) {
    boolean modified = false;
    Iterator<E> iterator = iterator();
    while (iterator.hasNext()) {
      if (!c.contains(iterator.next())) {
        iterator.remove();
        modified = true;
      }
    }
    return modified;
  }
}
