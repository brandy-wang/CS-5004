import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for the class MyStack
 */
class MyStackTest {

  @BeforeEach
  void setUp() {
    emptyStack = new MyStack<Integer>();
    filledStack = new MyStack<Integer>();
    filledStack.push(1);
    filledStack.push(2);
    filledStack.push(3);
    filledStack2 = new MyStack<String>();
    filledStack2.push("I");
    filledStack2.push("am");
    filledStack2.push("human");
    filledStack3 = new MyStack<Book>();
    filledStack3.push(new Book("Jane Eyre", "Charlotte Bronte", 1847, 35.99f) );
    filledStack3.push(new Book("The Martian", "Andy Weir", 2011, 32f));
    filledStack3.push(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 21.99f));
    emptyStack2 = new MyStack<Double>();
    emptyStack2.push(1.2);
    emptyStack2.push(2.4);
    emptyStack2.push(3.5);

  }


  MyStack<Integer> emptyStack;
  MyStack<Integer> filledStack;
  MyStack<String> filledStack2;
  MyStack<Book> filledStack3;
  MyStack<Double> emptyStack2;


  /**
   * Tests the push method when the stack is filled with integers
   */
  @Test
  void push() {
    emptyStack.push(1);
    emptyStack.push(2);
    emptyStack.push(3);
    assertEquals(3, emptyStack.pop());
    assertEquals(2, emptyStack.pop());
    assertEquals(1, emptyStack.pop());
  }

  /**
   * Tests the push method when the stack is filled with doubles
   */
  @Test
  void pushDouble() {
    emptyStack2.push(1.2);
    emptyStack2.push(2.4);
    emptyStack2.push(3.5);
    assertEquals(3.5, emptyStack2.pop());
    assertEquals(2.4, emptyStack2.pop());
    assertEquals(1.2, emptyStack2.pop());


  }

  /**
   * Tests the pop method when the stack is filled with integers
   */
  @Test
  void pop() {
    filledStack.pop();
    assertEquals(2, filledStack.pop());
    assertEquals(1, filledStack.pop());
    assertThrows(EmptyStackException.class, () -> filledStack.pop());
  }

  /**
   * Tests the pop method when the stack is filled with books from the imported Book class
   */
  @Test
  void popBook() {
    filledStack3.pop();
    assertEquals(new Book("The Martian", "Andy Weir", 2011, 32f), filledStack3.pop());
    assertEquals(new Book("Jane Eyre", "Charlotte Bronte", 1847, 35.99f), filledStack3.pop());
    assertThrows(EmptyStackException.class, () -> filledStack3.pop());

  }

  /**
   * Tests the top method when the stack is filled with integers
   */
  @Test
  void top() {
    filledStack.top();
    assertEquals(3, filledStack.top());
    filledStack.pop();
    assertEquals(2, filledStack.top());
    // this pops 2
    filledStack.pop();
    // this pops 1 and leaves an empty stack
    filledStack.pop();
    assertThrows(EmptyStackException.class, () -> filledStack.top());


  }

  /**
   * Tests the top method when the stack is filled with strings
   */
  @Test
  void topString() {
    filledStack2.top();
    assertEquals("human", filledStack2.top());
    filledStack2.pop();
    assertEquals("am", filledStack2.top());
    // this pops "am"
    filledStack2.pop();
    // this pops "I" and leaves an empty stack
    filledStack2.pop();
    assertThrows(EmptyStackException.class, () -> filledStack2.top());


  }

  /**
   * Tests the empty method
   */
  @Test
  void isEmpty() {
    assertEquals(true, emptyStack.empty());
    assertEquals(false, filledStack.empty());
    filledStack.pop();
    filledStack.pop();
    filledStack.pop();
    assertEquals(true, filledStack.empty());
  }

  /**
   * Tests the toString method
   */
  @Test
  void toStringTest() {
    assertEquals("Stack: 1 2 3 ", filledStack.toString());
    assertEquals("Stack: I am human ", filledStack2.toString());
    assertEquals("Stack: 1.2 2.4 3.5 ", emptyStack2.toString());
  }
}