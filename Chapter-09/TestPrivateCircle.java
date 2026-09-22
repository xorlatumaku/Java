public class TestPrivateCircle {
  public static void main(String[] args) {
    // Create a circle with radius 5.0
    PrivateCircle myCircle = new PrivateCircle(5.0);
    System.out.println("The area of the circle of radius "
        + myCircle.getRadius() + " is " + myCircle.getArea());
  }
}
