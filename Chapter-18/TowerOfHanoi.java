import java.util.Scanner;

public class TowerOfHanoi {
  public static void main(String[] args) {
    // Create a Scanner
    System.out.println("Enter number of disk: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
   
    // Find the solution recursively
    System.out.print("The moves are: ");
    moveDisks(n, 'A', 'B', 'C');

  }

  /* The method for finding the solution to move n disks 
   * from fromTower to toTower with auxTower
   */ 
  public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
    if (n == 1) // Base case 
      System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
    else {
      moveDisks(n - 1, fromTower, auxTower, toTower);// Recursive call 
      System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
      moveDisks(n - 1, auxTower, toTower, fromTower);   // Recursive call
    }
  }
}
