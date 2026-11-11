import java.util.*;

public class WeightedNineTailModel extends NineTailModel {
  /* Construct a model */
  public WeightedNineTailModel() {
    // Create edges
    List<WeightedEdge> edges = getEdges();

    // Create a graph
    WeightedGraph<Integer> graph = new WeightedGraph<Integer>(edges, NUMBER_OF_NODES);
  }
}
