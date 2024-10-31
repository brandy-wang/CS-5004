//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Date;
import java.util.EmptyStackException;

/**
 * A class that implements a stack
 * @param <T> the type parameter
 */
public class MyStack<T> {


  ArrayList<T> data;

  /**
   * Constructor with no parameter that creates an initially empty MyStack
   */
  public MyStack() {
    data = new ArrayList<T>();
  }

  /**
   * the push method that adds element x to the stack, returning void
   * @param x the element to be added
   */
  public void push(T x)
  {
    // adds an element
    data.add(x);
  }

  /**
   * the pop method that removes the last element of the stack and returns it
   * @return the last element of the stack
   * @throws EmptyStackException when stack is empty
   */
  public T pop() throws EmptyStackException
  {

    if (empty())
      throw new EmptyStackException();
    // Remove it
    return data.remove(data.size()-1);
  }

  /**
   * the top method that returns the last element of the stack without removing it
   * @return the last element of the stack
   * @throws EmptyStackException when the stack is empty
   */
  public T top() throws EmptyStackException
  {
    if (empty())
      throw new EmptyStackException();
    // Returns the last element without removing it
    return data.get(data.size()-1);
  }

  /**
   * the empty method that returns boolean, indicating whether the stack is empty or not
   * @return true if the stack is empty, false if it is not
   */
  public boolean empty()
  {
    return data.isEmpty();
  }

  //A. push() method adds element x to the stack, returning void
  //B. pop() method removes the last element of the stack and returns it
  //C. top() method returns the last element of the stack without removing it
  //D. empty() method returns boolean, indicating whether the stack is empty or not

  /**
   * the toString method that prints “Stack: ” followed by each of the elements, each separated by a single space
   * @return a string that prints “Stack: ” followed by each of the elements, each separated by a single space
   */
  @Override
  public String toString() {
    String itprints = "Stack: ";
    // Add element.tostring to our itprints

    for (int i = 0; i < data.size(); i++)
    {
      itprints += data.get(i).toString();
      itprints += " ";
    }

    return itprints;
  }
}

