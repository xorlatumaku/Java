public class Cirlce {
  double radius;

  // The number of objects created
  static int numberOfObjects = 0;

  // Construct a circle with radius 1
  Cirlce() {
    radius = 1;
    numberOfObjects++;
  }

  // Construct a circle with a specified radius
  Cirlce(double newRadius) {
    radius = newRadius;
    numberOfObjects++;
  }
}
