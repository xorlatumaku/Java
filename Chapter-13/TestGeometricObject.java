public class TestGeometricObject {
  public static void main(String[] args) {
    // Create two geometric objects
    GeometricObject geoObject1 = new Circle(5);
    GeometricObject geoObject2 = new Rectangle(5, 3);

    System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

    // Display circle
    displayGeometricObject(geoObject1);
  }
}
