public class StaticCircle {
  double radius;

  // The number of objects created
  static int numberOfObjects = 0;

  // Construct a circle with radius 1
  StaticCircle() {
    radius = 1;
    numberOfObjects++;
  }

  // Construct a circle with a specified radius
  StaticCircle(double newRadius) {
    radius = newRadius;
    numberOfObjects++;
  }

  // Return numberOfObjects
  static int getNumberOfObjects() {
    return numberOfObjects;
  }

  // Return the area of this circle
  double getArea() {
    return radius * radius * Math.PI;
  }
}
