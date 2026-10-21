import java.util.Collection;

public interface MyList<E> extends Collection<E> {
  /* Add a new element at the specified index in this list */
  public void add(int index, E e);
}
