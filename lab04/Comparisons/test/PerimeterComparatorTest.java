import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests the compare function which compares the perimeter of two shapes
 */
public class PerimeterComparatorTest {
 Circle circle1, circle2;

  /**
   * Defining circle1 and circle2
   * @throws Exception
   */
  @Before
  public void setUp() throws Exception {
    circle1 = new Circle(3,4,5);
    circle2 = new Circle(10.32,10.43,10);
  }

  /**
   * Compare function which compares the perimeter of two shapes
   */
  @Test
  public void compare() {
    PerimeterComparator perimeterComparator = new PerimeterComparator();
    int comparisonResult = perimeterComparator.compare(circle1, circle2);
    assertEquals(-1, comparisonResult);
    int comparisonResult2 = perimeterComparator.compare(circle2, circle1);
    assertEquals(1, comparisonResult2);
    int comparisonResult3 = perimeterComparator.compare(circle1, circle1);
    assertEquals(0, comparisonResult3);
  }
}