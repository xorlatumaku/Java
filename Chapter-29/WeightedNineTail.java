import java.util.Scanner;

public class WeightedNineTail {
  public static void main(String[] args) {
    // Prompt the user to enter the nine coins' Hs and Ts
    System.out.print("Enter an initial nine coins' Hs and Ts: ");
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    char[] initialNode = s.toCharArray();
    
    WeightedNineTailModel model = new WeightedNineTailModel();
  }
}
