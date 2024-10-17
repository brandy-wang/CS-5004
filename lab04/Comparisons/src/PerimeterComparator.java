import java.util.Comparator;

/**
 * It compares the perimeter of two given shapes
 */
public class PerimeterComparator implements Comparator<Shape> {

  /**
   * A function that compares the perimeter of two shapes
   * @param obj1 the first object to be compared.
   * @param obj2 the second object to be compared.
   * @return 0, 1, or -1 depending on the outcome of the comparison
   */
  public int compare(Shape obj1, Shape obj2)
  {
    double perimeterThis = obj1.perimeter();
    double perimeterThat = obj2.perimeter();
    if(perimeterThis < perimeterThat)
      return -1;
    else if (perimeterThat < perimeterThis)
      return 1;
    else
      return 0;
  }
}
