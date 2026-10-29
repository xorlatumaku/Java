public interface MyMap<K, V> {
  /* Remove all of the entries from this map */
  public void clear();

  /* Return true if the specified key is in the map */
  public boolean containsKey(K key);

  /* Return true if this map contains the specified value */
  public boolean containsValue(V value);
}
