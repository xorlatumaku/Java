import java.util.*;

public class WeightedGraph<V>extends UnweightedGraph<V> {
  /* Construct an empty */
  public WeightedGraph() {
  }

  /* Construct a WeightedGraph from vertices and edges in arrays */
  public WeightedGraph(V[] vertices, int[][] edges) {
    createWeightedGraph(java.util.Arrays.asList(vertices), edges);
  }

  /* Construct a WeightedGraph from vertices and edges in list */
  public WeightedGraph(int[][] edges, int numberOfVertices) {
    List<V> vertices = new ArrayList<>();
    for (int i = 0; i < numberOfVertices; i++)
      vertices.add((V)(Integer.valueOf(i)));

    createWeightedGraph(vertices, edges);
  }
}
