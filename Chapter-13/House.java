public class House implements Cloneable, Comparable<House> {
  private int id;
  private double area;
  private java.util.Date whenBuilt;

  public House(int id, double area) {
    this.id = id;
    this.area = area;
    whenBuilt = new java.util.Date();
  }
  
  public int getId() {
    return id;
  }

  public double getArea() {
    return area;
  }

  public java.util.Date getWhenBuilt() {
    return whenBuilt;
  }

  /* Override the protected clone method defined in the Object class,
   * and strengthen its accessibility
   */ 
  @Override
  public Object clone() {
    try () {
      return super.clone();
    } catch (CloneNotSupportedException ex) {
      //TODO: handle exception
      return null;
    }
  }
}
