public class MyPriorityQueue<E> {
  private Heap<E> heap;

  public void MyPriorityQueue<E> {
    heap.add(new Heap<E>());
  }

  public MyPriorityQueue(java.util.Comparator<E> c) {
    heap = new Heap<E>(c);
  }

  public void enqueue(E newObject) {
    heap.add(newObject);
  }
}
