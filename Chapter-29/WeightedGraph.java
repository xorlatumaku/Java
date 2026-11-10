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

  /* Construct a WeightedGraph for vertices 0, 1, 2 and edge list */
  public WeightedGraph(List<V> vertices, List<WeightedEdge> edges) {
    createWeightedGraph(vertices, edges);
  }

  /* Construct a WeightedGraph from vertices 0, 1, and edge array */
  public WeightedGraph(List<WeightedEdge> edges, int numberOfVertices) {
    List<V> vertices = new ArrayList<>();
    for (int i = 0; i < numberOfVertices; i++)
      vertices.add((V)(Integer.valueOf(i)));

    createWeightedGraph(vertices, edges);
  }

  /* Create adjacency lists from edge arrays */
  private void createWeightedGraph(List<V> vertices, int[][] edges) {
    this.vertices = vertices;

    
  }
}
