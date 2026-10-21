import java.util.Collection;

public interface MyList<E> extends Collection<E> {
  /* Add a new element at the specified index in this list */
  public void add(int index, E e);

  /* Return the element from this list at the specified index */
  public E get(int index);
}
