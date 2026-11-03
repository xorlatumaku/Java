public interface Graph<V> {
  /* Return the number of vertices in the graph */
  public int getSize();

  /* Return the vertices in the graph */
  public java.util.List<V> getVertices();

  /* Return the object for the specified vertex index */
  public V getVertex(int index);
}
