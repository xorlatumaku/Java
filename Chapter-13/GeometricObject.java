public abstract class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  // Construct a default geometric object
  private GeometricObject() {
    dateCreated = new java.util.Date();
  }
}
