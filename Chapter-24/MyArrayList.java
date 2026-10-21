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

  @Override /* Add a new element at the specified index */
  public void add(int index, E e) {
    // Ensure the index is in the right range
    if (index < 0 || index > size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);

    ensureCapacity();

    /* Move the elements to the right after the specified index */
    for (int i = size - 1; i >= index; i--)
      data[i + 1] = data[i];

    /* Insert new element to data[index] */
    data[index] = e;

    /* Increase size by 1 */
    size++;
  }

  /* Create a new larger array, double the current size + 1 */
  private void ensureCapacity() {
    if (size >= data.length) {
      E[] newData = (E[])(new Object[size * 2 + 1]);
      System.arraycopy(data, 0, newData, 0, size);
      data = newData;
    }
  }
}
