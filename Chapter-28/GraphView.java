import javafx.scence.Group;
import javafx.scence.layout.BorderPane;
import javafx.scence.shape.Circle;
import javafx.scence.shape.Line;
import javafx.scence.text.Text;

public class GraphView extends BorderPane {
  private Graph<? extends Displayable> graph;
  private Group group = new Group();
}
