public class TotalArea {
  public static void main(String[] args) {
    // Declare circleArray
    Circle[] circleArray = createCircleArray();

    // Print circleArray and total areas of the circles
    printCircleArray(circleArray);
  }

  // Create an array of Circle objects
  public static Circle[] createCircleArray() {
    Circle[] circleArray = new Circle[5];

    for (int i = 0; i < circleArray.length; i++) {
      circleArray[i] = new Circle(Math.random() * 100);
    }

    // Return Circle array
    return circleArray;
  }
}
