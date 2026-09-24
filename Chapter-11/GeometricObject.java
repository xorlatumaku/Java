public class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  // Construct a default geometric object
  public GeometricObject() {
    dateCreated = new java.util.Date();
  }

  // Construct a geometric object with the specified color and filled value
  public GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  // Return color
  public String getColor() {
    return color;
  }
}
