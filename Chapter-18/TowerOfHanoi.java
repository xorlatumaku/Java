import java.util.Scanner;

public class TowerOfHanoi {
  public static void main(String[] args) {
    // Create a Scanner
    System.out.println("Enter number of disk: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();


  }

  // The method for finding the solution to disk problem
  public static void moveDisks(int n, char toTower, char fromTower, char auxTower) {
    if (n == 1) // Base case 
      System.out.println("Move " + n + " from " + fromTower + " to " + toTower);
    else {
      moveDisks(n - 1, fromTower, auxTower, toTower);   // Recursive call 
      moveDisks(n - 1, auxTower, toTower, fromTower);   // Recursive call
    }
  }
}
