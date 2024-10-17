/**
 * Created by ashesh on 1/26/2017.
 */
public abstract class AbstractShape implements Shape {

  /**
   * The reference point for a shape
   */
  protected Point2D reference;

  /**
   * Constructs an abstract shape using a reference point
   * @param reference reference point for the shape
   */
  public AbstractShape(Point2D reference) {
    this.reference = reference;
  }

  @Override
  public double distanceFromOrigin() {
    return reference.distToOrigin();
  }

  /**
   * A function that compares the area of two shapes
   * @param s the object to be compared.
   * @return 0, 1, or -1 depending on the outcome of the comparison
   */
  @Override
  public int compareTo(Shape s) {
    double areaThis = this.area();
    double areaOther = s.area();

    if (areaThis < areaOther) {
      return -1;
    } else if (areaOther < areaThis) {
      return 1;
    } else {
      return 0;
    }
  }
}