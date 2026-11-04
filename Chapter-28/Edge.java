public class Edge {
  public int u; // Starting vertex of the edge
  public int v; // Ending vertex of the edge

  /* Construct an edge for (u, v) */
  public Edge(int u, int v) {
    this.u = u;
    this.v = v;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Edge) {
      Edge e = (Edge) o;
      return u == e.u && v == e.v;
    }
    return false;
  }
}
