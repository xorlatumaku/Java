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
}
