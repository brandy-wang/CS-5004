import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;




public class TriangleTest {

  Triangle tri1;
  Triangle tri2;

  @Before
  public void setUp() throws Exception {
    tri1 = new Triangle(0, 0, 0, 1, 0, 2);
    tri2 = new Triangle(0, 0, 1, 1, 0, 1);

  }



  @Test
  public void area() {
    assertEquals(0, tri1.area(),0.001);
    assertEquals(0.5, tri2.area(),0.001);
  }


  @Test
  public void perimeter() {
    assertEquals(4,tri1.perimeter(),0.001);
    assertEquals(3.414,tri2.perimeter(),0.001);
  }

  @Test
  public void resize() {
    Triangle resizedTri1 = tri1.resize(3.5);
    Triangle resizedTri2 = tri2.resize(0.005);

    assertEquals(3.5*tri1.area(),resizedTri1.area(),0.001);
    assertEquals(0.005*tri2.area(),resizedTri2.area(),0.001);
  }

  @Test
  public void testToString() {
    assertEquals("Triangle: point 1 (0.000,0.000) point 2 (0.000,1.000) point 3 (0.000,2.000)", tri1.toString());
    assertEquals("Triangle: point 1 (0.000,0.000) point 2 (1.000,1.000) point 3 (0.000,1.000)", tri2.toString());

  }

  @Test
  public void testTriangleConstructor() {
    assertThrows(IllegalArgumentException.class, ()->{
      Triangle badTri = new Triangle(0, 0, 0, 0, 0, 1);
    });
  }
}






