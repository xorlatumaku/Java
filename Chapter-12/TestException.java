public class TestException {
  public static void main(String[] args) {
    try {
      System.out.println(sum(new int[] {1, 2, 3, 4, 5}));
    } catch (Exception e) {
      //TODO: handle exception
      ex.printStackTrace();
      System.out.println("\n" + ex.getMessage());
      System.out.println("\n" + ex.toString());
    }
  }
}
