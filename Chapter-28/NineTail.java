import java.util.Scanner;

public class NineTail {
  public static void main(String[] args) {
    // Prompt the user to enter nine coins' Hs and Ts
    System.out.print("Enter the initial nine coins Hs and Ts: ");
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    char[] initialNode = s.toCharArray();
  }
}
