import javax.swing.text.Element;

/**
 * Represents a node with data
 */
public class ElementNode implements ListOfInts{

  private int data;
  private ListOfInts rest;

  /**
   * Constructor
   * @param data Data in the node
   * @param rest Data except the first node
   */
  public ElementNode(int data, ListOfInts rest) {
    this.data = data;
    this.rest = rest;
  }

  @Override
  public ListOfInts prepend(int data) {
    ElementNode nnode = new ElementNode(data, this);
    return nnode;
  }

  @Override
  public ListOfInts append(int data) {

    if (this.getCountClassic() == 1)
    {
      ElementNode nnode = new ElementNode(data, this.rest);
      this.rest = nnode;
    }
    else
    {
      this.rest.append(data);
    }

    return this;
  }

  @Override
  public ListOfInts insertAtIndex(int data, int index) {

    if (index == 0)
    {
      prepend(data);
    }
    else if (index == 1)
    {
      ElementNode nnode = new ElementNode(data, this.rest);
      this.rest = nnode;
    }
    else
    {
      this.rest.insertAtIndex(data, index - 1);
    }
    return this;
  }

  @Override
  public int getDataAtIndex(int index) {
    if (index == 0)
      return data;
    return this.getRest().getDataAtIndex(index - 1);
  }

  @Override
  public ListOfInts getRest() {
    return rest;
  }

  @Override
  public int getCountClassic() {
    return 1 + this.getRest().getCountClassic();
  }

  @Override
  public int getCountWithHelper() {
    return getCountHelper(0);
  }

  @Override
  public int getCountHelper(int acc) {
    return getRest().getCountHelper(acc + 1);
  }

  @Override
  public int getSum() {
    return data + getRest().getSum();
  }

  /**
   * Returns String of the element node
   * @return String of the element node
   */
  public String toString()
  {
    return "[" + data + "]" + this.rest.toString();
  }
}
