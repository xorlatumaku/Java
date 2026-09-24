import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    // Display result
    System.out.println("Ignoring nonalphanumeric characters, \nis " + s + " a palindrome? " + isPalindrome(s));
  }

  // Return true if a string is a palindrome
  public static boolean isPalindrome(String s) {
    // Create a new string by eliminating nonalphanumeric chars
    String s1 = filter(s);

    // Create a new string that is the reversal of s1
    String s2 = reverse(s1);
  }
}
