public class Heap<E> {
  private java.util.ArrayList<E> list = new java.util.ArrayList<>();
  private java.util.Comparator<? super E> c;

  /* Create a default heap */
  public Heap() {
    this.c = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
  }

  /* Create a heap with a specified comparator */
  public Heap(java.util.Comparable<E> c) {
    this.c = c;
  }

  /* Create a heap from an array of objects */
  public Heap(E[] objects) {
    this.c = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
    for (int i = 0; i < objects.length; i++)
      add(objects[i]);
  }

  /* Add a new object into the heap */
  public void add(E newObject) {
    list.add(newObject); // Append the heap
  }
}
