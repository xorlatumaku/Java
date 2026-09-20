public class TestCircle {
  public static void main(String[] args) {
    // Create a circle with radius 1
    Circle circle1 = new Circle();
    System.out.println("The area of the circle of radius "
        + circle1.radius + " is " + circle1.getArea());
    
    // Create a circle with radius 25
    Circle circle2 = new Circle(25);
    System.out.println("The area of the circle of radius "
        + circle2.radius + "is" + circle2.getArea());
  }
}
