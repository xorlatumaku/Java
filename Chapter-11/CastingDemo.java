public class CastingDemo {
  public static void main(String[] args) {
    // Create and initialize two objects
    Object object1 = new Circle(1);
    Object object2 = new Rectangle(1, 1);

    // Display circle and rectangle
    displayObject(object1);
    displayObject(object2);
  }
}
