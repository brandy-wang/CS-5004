import java.util.Comparator;

/**
 * Comparator for comparing ToDoItem objects based on their urgency levels.
 */
public class UrgencyComparator implements Comparator<ToDoItem> {

  /**
   * Compares two ToDoItem objects based on their urgency. The comparison is done by assuming that a lower urgency value indicates that it's more urgent
   * <p></p>
   * @param itm1 the first object to be compared.
   * @param itm2 the second object to be compared.
   * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
   */
  @Override
  public int compare(ToDoItem itm1, ToDoItem itm2) {
    // Assuming getUrgency returns an integer where a lower number is more urgent
    return Integer.compare(itm1.getUrgency(), itm2.getUrgency());;
  }
}