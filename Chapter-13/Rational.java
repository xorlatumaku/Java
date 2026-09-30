public class Rational extends Number implements Comparable<Rational> {
  // Data fields for numerator and denominator
  private long numerator = 0;
  private long denominator = 1;

  // Construct a rational with default properties
  public Rational() {
    this(0, 1);
  }
}
