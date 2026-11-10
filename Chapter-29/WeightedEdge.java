public class WeightedEdge extends Edge
    implements Comparable<WeightedEdge> {
  public double weight;   // The weight on edge (u, v)

  /* Create a weighted edge on (u, v) */
  public WeightedEdge(int u, int v, double weight) {
    super(u, v);
    this.weight = weight;
  }
}
