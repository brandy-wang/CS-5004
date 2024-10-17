import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * This class contains unit tests for the shape triangle
 */

public class TriangleTest {

  Triangle tri1;
  Triangle tri2;

  /**
   * This setup creates different triangles with different parameters
   */
  @Before
  public void setUp() throws Exception {
    tri1 = new Triangle(0, 0, 5, 5, 0, 3);
    tri2 = new Triangle(2, 5, 6, 1, 9, 6);

  }


  /**
   * Tests whether the area methods work correctly for all triangles
   */
  @Test
  public void area() {
    assertEquals(7.5, tri1.area(),0.001);
    assertEquals(16.0, tri2.area(),0.001);
  }

  /**
   * Tests whether the perimeter methods work correctly for all triangles
   */
  @Test
  public void perimeter() {
    assertEquals(15.456,tri1.perimeter(),0.001);
    assertEquals(18.559,tri2.perimeter(),0.001);
  }

  /**
   * Tests whether the resize methods work correctly for all triangles
   */
  @Test
  public void resize() {
    Shape resizedTri1 = tri1.resize(3.5);
    Shape resizedTri2 = tri2.resize(0.5);

    assertEquals(3.5*tri1.area(),resizedTri1.area(),0.001);
    assertEquals(0.5*tri2.area(),resizedTri2.area(),0.001);
  }

  /**
   * Tests whether the triangles have been created with the correct numbers or not.
   * It does this by using their toString methods
   */
  @Test
  public void testToString() {
    assertEquals("Triangle: point 1 (0.000,0.000) point 2 (5.000,5.000) point 3 (0.000,3.000)", tri1.toString());
    assertEquals("Triangle: point 1 (2.000,5.000) point 2 (6.000,1.000) point 3 (9.000,6.000)", tri2.toString());

  }

  /**
   * Tests whether the constructor works correctly by throwing an illegal argument exception when the triangle has two identical points
   */
  @Test
  public void testTriangleConstructor() {
    assertThrows(IllegalArgumentException.class, ()->{
      Triangle badTri = new Triangle(0, 0, 0, 0, 0, 1);
    });
  }
}






