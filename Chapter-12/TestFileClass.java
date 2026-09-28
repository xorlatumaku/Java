public class TestFileClass {
  public static void main(String[] args) {
    java.io.File file = new java.io.File("./image/us.gif");
    System.out.println("Does it exist? " + file.exists());
    System.out.println("The file has " + file.length() + " bytes");
    System.out.println("Can it be read? " + file.canRead());
    System.out.println("Can it be written? " + file.canWrite());
  }
}
