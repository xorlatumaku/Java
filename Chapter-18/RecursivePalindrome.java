public class RecursivePalindrome {
  public static boolean isPalindrome(String s) {
   return isPalindrome(s, 0, s.length() - 1);
  }

  private static boolean isPalindrome(String s, int low, int high) {
    if (high <= low)  // Base case
      return true;
  }

  public static void main(String[] args) {
    System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
    System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
    System.out.println("Is a a palindrome? " + isPalindrome("a"));
    System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
    System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
  }
}
