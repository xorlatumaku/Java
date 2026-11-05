import  java.util.*;

public class NineTailModel {
  public final static int NUMBER_OF_NODES = 512;
  protected UnweightedGraph<Integer>.SearchTree tree;

  /* Construct a model */
  public NineTailModel() {
    // Create edges
    List<Edge> edges = getEdges();

    // Create a graph
    UnweightedGraph<Integer> graph = new UnweightedGraph<>(edges, NUMBER_OF_NODES);

    // Obtain a BSF tree rooted at the target node
    tree = graph.bfs(511);
  }

  /* Create all edges for the graph */
  private List<Edge> getEdges() {
    List<Edge> edges = new ArrayList<>(); // Store edges

    for (int u = 0; u < NUMBER_OF_NODES; u++) {
      for (int k = 0; k < 9; k++) {
        char[] node = getNode(u);  // Get the node for vertex u
        if (node[k] == 'H') {
          int v = getFlippedNode(node, k);
          // Add edge (v, u) for a legal move from node u to node v
          edges.add(new Edge(v, u));
        }
      }
    }

    return edges;
  }
}
