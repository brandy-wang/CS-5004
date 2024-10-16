import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import javax.swing.text.Element;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for ListOfInts
 */
public class ListOfIntsTest {

  ListOfInts empty;
  ListOfInts single;
  ListOfInts triple;

  /**
   * Sets up lists for each test
   * @throws Exception
   */
  @Before
  public void setUp() throws Exception {
    empty = new EmptyNode();
    single = new EmptyNode();
    single = single.append(3);
    triple = new EmptyNode();
    triple = triple.append(5);
    triple = triple.append(6);
    triple = triple.append(8);
  }

  /**
   * Tests if the node is added to the front correctly
   */
  @Test
  public void prepend() {
    empty = empty.prepend(10);
    assertEquals(10, empty.getSum());

    single = single.prepend(15);
    assertEquals(18, single.getSum());

    triple = triple.prepend(20);
    assertEquals(39, triple.getSum());
  }

  /**
   * Tests if the node is added to the end correctly
   */
  @Test
  public void append() {
    empty = empty.append(10);
    assertEquals(10, empty.getSum());

    single = single.append(15);
    assertEquals(18, single.getSum());

    triple = triple.append(20);
    assertEquals(39, triple.getSum());
  }

  /**
   * Tests if the node is added to the appointed index correctly
   */
  @Test
  public void insertAtIndex() {
    empty = empty.insertAtIndex(10, 0);
    assertEquals(10, empty.getSum());

    assertThrows(IndexOutOfBoundsException.class, () -> {
      empty = empty.insertAtIndex(30, 5);
    });

    single = single.insertAtIndex(15, 1);
    assertEquals(18, single.getSum());

    triple = triple.insertAtIndex(20, 2);
    assertEquals(39, triple.getSum());
  }

  /**
   * Tests if the data the appointed index is correct
   */
  @Test
  public void getDataAtIndex() {
    assertThrows(IndexOutOfBoundsException.class, () -> {
      empty.getDataAtIndex(0);
    });

    assertEquals(3, single.getDataAtIndex(0));

    assertEquals(8, triple.getDataAtIndex(2));
  }

  /**
   * Tests if the rest except the first one is correct
   */
  @Test
  public void getRest() {

    assertThrows(IndexOutOfBoundsException.class, () -> {
      empty = empty.getRest();
    });

    single = single.getRest();
    assertEquals(0, single.getCountClassic());

    triple = triple.getRest();
    assertEquals(2, triple.getCountClassic());
  }

  /**
   * Tests if the count of the list is correct
   */
  @Test
  public void getCountClassic() {
    assertEquals(0, empty.getCountClassic());
    assertEquals(1, single.getCountClassic());
    assertEquals(3, triple.getCountClassic());
  }

  /**
   * Tests if the count of the list is correct
   */
  @Test
  public void getCountWithHelper() {
    assertEquals(0, empty.getCountWithHelper());
    assertEquals(1, single.getCountWithHelper());
    assertEquals(3, triple.getCountWithHelper());
  }

  /**
   * Tests if the count of the list is correct
   */
  @Test
  public void getCountHelper() {
    assertEquals(0, empty.getCountHelper(0));
    assertEquals(1, single.getCountHelper(0));
    assertEquals(3, triple.getCountHelper(0));
  }

  /**
   * Tests if the sum of the list is correct
   */
  @Test
  public void getSum() {
    assertEquals(0, empty.getSum());
    assertEquals(3, single.getSum());
    assertEquals(19, triple.getSum());
  }

  /**
   * Tests if the constructor is correct
   */
  @Test
  public void constructor() {
    EmptyNode enode = new EmptyNode();
    assertEquals(0, enode.getCountClassic());

    ElementNode nnode = new ElementNode(20, enode);
    assertEquals(1, nnode.getCountClassic());
  }

  /**
   * Tests if the toString is correct
   */
  @Test
  public void testToString() {
    assertEquals("()", empty.toString());
    assertEquals("[3]()", single.toString());
    assertEquals("[5][6][8]()", triple.toString());
  }
}