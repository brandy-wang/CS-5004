import java.util.Comparator;

/**
 * Javadocs in progress
 */
public class UrgencyComparator implements Comparator<ToDoItem> {

  /**
   * Student to provide Javadocs here
   * <p></p>
   * @param itm1 the first object to be compared.
   * @param itm2 the second object to be compared.
   * @return
   */
  @Override
  public int compare(ToDoItem itm1, ToDoItem itm2) {
    // Assuming getUrgency returns an integer where a lower number is more urgent
    return Integer.compare(itm1.getUrgency(), itm2.getUrgency());
  }
}
