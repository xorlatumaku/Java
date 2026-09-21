public class TestStaticCircle {
  public static void main(String[] args) {
    System.out.println("Before creating objects");
    System.out.println("The number of Circle objects is " + StaticCircle.numberOfObjects);

    // Circle c1
    StaticCircle c1 = new StaticCircle();
  }
}
