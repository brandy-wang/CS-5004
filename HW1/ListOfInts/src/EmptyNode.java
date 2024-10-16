/**
 * Represents an empty node
 */
public class EmptyNode implements ListOfInts {

  /**
   * Constructor
   */
  public EmptyNode()
  {

  }

  @Override
  public ListOfInts prepend(int data) {
    return append(data);
  }

  @Override
  public ListOfInts append(int data) {
    ElementNode haha = new ElementNode(data, this);
    return haha;
  }

  @Override
  public ListOfInts insertAtIndex(int data, int index) {
    if (index >= 1)
      throw new IndexOutOfBoundsException();
    return append(data);
  }

  @Override
  public int getDataAtIndex(int index) {
    throw new IndexOutOfBoundsException();
  }

  @Override
  public ListOfInts getRest() {
    throw new IndexOutOfBoundsException();
  }

  @Override
  public int getCountClassic() {
    return 0;
  }

  @Override
  public int getCountWithHelper() {
    return 0;
  }

  @Override
  public int getCountHelper(int acc) {
    return acc;
  }

  @Override
  public int getSum() {
    return 0;
  }

  /**
   * Returns String of the empty node
   * @return String of the empty node
   */
  public String toString()
  {
    return "()";
  }
}
