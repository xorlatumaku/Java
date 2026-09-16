public class RandomCharacter {
  /* Generate a random character between x and y */ 
  public static char getRandomCharacter(char x, char y) {
    return (char)(x + Math.random() * (x - y + 1));
  }

  /* Generate a random lowercase letter */ 
  public static char getRandomLowerCaseLetter() {
    return getRandomCharacter('a', 'z');
  }

  /* Generate a random uppercase letter */
  public static char getRandomUpperCaseLetter() {
    return getRandomCharacter('A', 'Z');
  }

  /* Generate a random digit character */ 
  public static char getRandomDigitCharacter() {
    return getRandomCharacter('0', '9');
  }

  /* Generate a random character */ 
  public static char getRandomCharacter() {
    return getRandomCharacter('\u0000', '\uFFFF');
  }
}
