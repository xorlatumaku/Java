public class TestStaticCircle {
  public static void main(String[] args) {
    System.out.println("Before creating objects");
    System.out.println("The number of Circle objects is " + StaticCircle.numberOfObjects);

    // Circle c1
    StaticCircle c1 = new StaticCircle();

    // Display c1 BEFORE c2 is created
    System.out.println("\nAfter creating c1");
    System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects ("
        + c1.numberOfObjects + ")");

    // Create c2
    StaticCircle c2 = new StaticCircle(5);

  }
}
