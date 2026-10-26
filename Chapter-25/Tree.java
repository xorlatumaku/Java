import java.util.Collection;

public interface Tree<E> extends Collection<E> {
  /* Return true if the element is in the tree */
  public boolean search(E e);

  /* Insert element e into the binary tree
   * Return true if the element is inserted successfully */
  public boolean insert(E e);
}
