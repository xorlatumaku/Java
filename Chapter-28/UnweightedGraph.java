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
  
  /* Construct a graph for integer vertices 0, 1, 2 and edge list */
  protected UnweightedGraph(List<Edge> edges, int numberOfVertices) {
    for (int i = 0; i < numberOfVertices; i++)
      addVertex((V)(Integer.valueOf(i))); // vertices is {0, 1, . . .}
    
    createAdjacencyLists(edges, numberOfVertices);
  }

  /* Construct a graph from integer vertices 0, 1, and edge array */
  protected UnweightedGraph(int[][] edges, int numberOfVertices) {
    for (int i = 0; i < numberOfVertices; i++) 
      addVertex((V)(Integer.valueOf(i))); // vertices is {0, 1, . . .}
    
    createAdjacencyLists(edges, numberOfVertices);
  }

  /* Create adjacency lists for each vertex */
  private void createAdjacencyLists(int[][] edges, int numberOfVertices) {
    for (int i = 0; i < edges.length; i++) {
      addEdge(edges[i][0], edges[i][1]);
    }
  }
  
  /* Create adjacency lists for each vertex */
  private void createAdjacencyLists(List<Edge> edges, int numberOfVertices) {
    for (Edge edge : edges) {
      addEdge(edge.u, edge.v);
    }
  }
  
  @Override /* Return the number of vertices in the graph */
  public int getSize() {
    return vertices.size();
  }
  
  @Override /* Return the vertices in the graph */
  public List<V> getVertices() {
    return vertices;
  }

  }
