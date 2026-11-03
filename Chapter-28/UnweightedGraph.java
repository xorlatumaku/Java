import java.util.*;

public class UnweightedGraph<V> implements Graph<V> {
  protected List<V> vertices =  new ArrayList<>();  // Store vertices
  protected List<List<Edge>> neighbors = new ArrayList<>(); // Adjacency Edge lists
  
  /* Construct an empty graph */
  protected UnweightedGraph() {
  }
  }
