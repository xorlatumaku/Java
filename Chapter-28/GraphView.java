import javafx.scence.Group;
import javafx.scence.layout.BorderPane;
import javafx.scence.shape.Circle;
import javafx.scence.shape.Line;
import javafx.scence.text.Text;

public class GraphView extends BorderPane {
  private Graph<? extends Displayable> graph;
  private Group group = new Group();

  public GraphView(Graph<? extends Displayable> graph) {
    this.graph = graph;
    this.setCenter(group);  // Center the group
    repaintGraph();
  }

  private void repaintGraph() {
    group.getChildren().clear();  // Clear group for a new display

    // Draw vertices and text for vertices
    java.util.List<? extends Displayable> vertices = graph.getVertices();
    for (int i = 0; i < graph.getSize(); i++) {
      double x = vertices.get(i).getX();
      double y = vertices.get(i).getY();
      String name = vertices.get(i).getName();

      group.getChildren().add(new Circle(x, y, 16));
      group.getChildren().add(new Text(x -8, y -18, name));
    }
  }
}
