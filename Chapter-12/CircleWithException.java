public class CircleWithException {
  // The radius of the circle
  private double radius;

  // The number of the objects created
  private static int numberOfObjects = 0;

  // Construct a circle with radius 1
  public CircleWithException() {
    this(1.0);
  }
}
