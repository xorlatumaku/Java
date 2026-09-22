public class PrivateCircle {
  // The radius of the circle
  private double radius = 1;

  // The number of objects created
  private static int numberOfObjects = 0;

  // Construct a circle with radius 1
  public PrivateCircle() {
    numberOfObjects++;
  }

  // Construct a circle with a specified radius
  public PrivateCircle(double newRadius) {
    radius = newRadius;
    numberOfObjects++;
  }
}
