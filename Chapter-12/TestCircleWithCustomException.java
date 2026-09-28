public class TestCircleWithCustomException {
  public static void main(String[] args) {
    try {
      new CircleWithCustomException(5);
      new CircleWithCustomException(-5);
      new CircleWithCustomException(0);
    } catch (InvalidRadiusException ex) {
      //TODO: handle exception
      System.out.println(ex);
    }

    System.out.println("Number of objects created: " + CircleWithCustomException.getNumberOfObjects());
  }
}

class CircleWithCustomException {
  // The radius of the circle
  private double radius;

  // The number of objects created
  private static int numberOfObjects = 0;
}
