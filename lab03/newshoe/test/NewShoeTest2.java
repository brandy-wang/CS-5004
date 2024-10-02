import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewShoeTest2 {
  // Declare test objects
  private NewShoe shoe1;
  private NewShoe shoe2;


  @Before
  public void setUp() throws Exception {
    // Initialize test objects before each test
    shoe1 = new NewShoe("heels", Color.GREEN, "Jimmy Choo", 7.5);
    // Example of shoe
    shoe2 = new NewShoe("flats", Color.RED, "Nike", 10.5);

  }

  @Test
  public void getType() {
    //test1:check whether return value-type is correct
    assertEquals("heels", shoe1.getType());
    //test2:check for not empty
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
      //pass empty string to trigger exception
      new NewShoe("", Color.GREEN, "Jimmy Choo", 7.5);
    });
    assertEquals("type cannot be empty", exception.getMessage());
  }

  @Test
  public void getColor() {
    //test1:check whether return value-type is correct for shoe1
    assertEquals(Color.GREEN,shoe1.getColor());
    //test2:check whether return value-type is correct for shoe2
    assertEquals(Color.RED,shoe2.getColor());
  }

  @Test
  public void getBrand() {
    //test1:check whether return value-brand is correct for shoe1
    assertEquals("Jimmy Choo",shoe1.getBrand());
    //test2:check whether return value-brand is not correct for shoe2
    assertEquals("Nike",shoe2.getBrand());
  }

  @Test
  public void getSize() {
    //test1:check whether return value-size is correct for shoe1
    assertEquals(7.5,shoe1.getSize(),0);
    //test2:check whether return value-size is correct for shoe2
    assertEquals(10.5,shoe2.getSize(),0);

  }

  @Test
  public void testToString() {
    //test1:expected version for shoe1
    String expected = "Type: heels" +"\n" + "Color: GReen" +"\n" + "Brand: Jimmy Choo" +"\n" + "Size: 7.50";
    assertEquals(expected,shoe1.toString());
    //test2:unexpected version for shoe2
    String unexpected = "Type: flats" +"\n" + "Color: rEd" +"\n" + "Brand: Nike" +"\n" + "Size: 10.50";
    assertEquals(unexpected,shoe2.toString());


  }
}