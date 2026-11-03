import java.util.*;

public class UnweightedGraph<V> implements Graph<V> {
  protected List<V> vertices =  new ArrayList<>();  // Store vertices
  protected List<List<Edge>> neighbors = new ArrayList<>(); // Adjacency Edge lists
  
  /* Construct an empty graph */
  protected UnweightedGraph() {
  }

  /* Construct a graph from vertices and edges stored in arrays */
  protected UnweightedGraph(V[] vertices, int[][] edges) {
    for (int i = 0; i < vertices.length; i++)
      addVertex(vertices[i]);
    createAdjacencyLists(edges, vertices.length);
  }
  
  /* Construct a graph from vertices and edges stored in List */
  protected UnweightedGraph(List<V> vertices, List<Edge> edges) {
    for (int i = 0; i < vertices.size(); i++)
      addVertex(vertices.get(i));
    createAdjacencyLists(edges, vertices.size());
  }

  }
