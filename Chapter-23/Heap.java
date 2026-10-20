public class Heap<E> {
  private java.util.ArrayList<E> list = new java.util.ArrayList<>();
  private java.util.Comparator<? super E> c;

  /* Create a default heap */
  public Heap() {
    this.c = (e1, e2) -> ((Comparable<E>)e1).compareTo(e2);
  }
}
