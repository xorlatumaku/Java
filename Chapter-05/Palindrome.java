import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    // The index of the first character in the string
    int indexFirst = 0;

    // The index of the last character in the string
    int indexLast = s.length() - 1;

    boolean isPalindrome = true;
    while (indexFirst < indexLast) {
      if (s.charAt(indexFirst) != s.charAt(indexLast)) {
        isPalindrome = false;
        break;
      }

      indexFirst++;
      indexLast--;
    }

    if (isPalindrome) 
      System.out.println(s + " is a palindrome");
    else
      System.out.println(s + " is not a palindrome");
  }
}
