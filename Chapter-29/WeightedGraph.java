import java.util.*;

public class WeightedGraph<V>extends UnweightedGraph<V> {
  /* Construct an empty */
  public WeightedGraph() {
  }

  /* Construct a WeightedGraph from vertices and edges in arrays */
  public WeightedGraph(V[] vertices, int[][] edges) {
    createWeightedGraph(java.util.Arrays.asList(vertices), edges);
  }
}
