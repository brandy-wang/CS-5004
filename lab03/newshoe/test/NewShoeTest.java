import static org.junit.Assert.*;

import org.junit.Test;

public class NewShoeTest {


  @Test
  public void test_constructor() {
    //NewShoe test_shoe = new NewShoe("", Color.GREEN, "Jimmy Choo", 7);
  }
  @Test
  public void test_constructor2() {

  }



  @Test
  public void getType() {
    NewShoe test_shoe = new NewShoe("heels", Color.GREEN, "Jimmy Choo", 7);
    assertEquals("Testing getType getter method", "heels", test_shoe.getType());
  }
  @Test
  public void getType2() {
    NewShoe test_shoe = new NewShoe("flats", Color.GREEN, "Jimmy Choo", 7);
    assertEquals("Testing getType getter method again", "flats", test_shoe.getType());
  }

  @Test
  public void getColor() {
    NewShoe test_shoe = new NewShoe("heels", Color.RED, "Dior", 7);
    assertEquals("Testing getColor getter method", Color.RED, test_shoe.getColor());
  }
  @Test
  public void getColor2() {
    NewShoe test_shoe = new NewShoe("heels", Color.BLUE, "Dior", 8);
    assertEquals("Testing getColor getter method again", Color.BLUE, test_shoe.getColor());
  }
  @Test
  public void getBrand() {
    NewShoe test_shoe = new NewShoe("flats", Color.RED, "Nike", 10);
    assertEquals("Testing getBrand getter method", "Nike", test_shoe.getBrand());
  }
  @Test
  public void getBrand2() {
    NewShoe test_shoe = new NewShoe("flats", Color.RED, "Levi's", 10);
    assertEquals("Testing getBrand getter method again", "Levi's", test_shoe.getBrand());
  }
  @Test
  public void getSize() {
    NewShoe test_shoe = new NewShoe("Sneaker", Color.BLUE, "Vans", 10);
    assertEquals("Testing getSize getter method", 10, test_shoe.getSize(), 0);
  }
  @Test
  public void getSize2() {
    NewShoe test_shoe = new NewShoe("Sandal", Color.BLUE, "Birkenstock", 9);
    assertEquals("Testing getSize getter method again", 9, test_shoe.getSize(), 0);
  }
  @Test
  public void testToString() {
    NewShoe test_shoe = new NewShoe("Sandal", Color.ORANGE, "Birkenstock", 9);
    assertEquals("Testing toString method", "Type: Sandal" +"\n" +"Color: To Be Determined" + "\n" + "Brand: Birkenstock" + "\n" + "Size: 9.00", test_shoe.toString());
  }
  @Test
  public void testToString2() {
    NewShoe test_shoe = new NewShoe("Sandal", Color.BLUE, "Birkenstock", 9);
    assertEquals("Testing toString method again", "Type: Sandal" +"\n" +"Color: blUE" + "\n" + "Brand: Birkenstock" + "\n" + "Size: 9.00", test_shoe.toString());
  }
}