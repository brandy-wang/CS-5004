/**
 * List of Integers
 */
public interface ListOfInts {

  /**
   * Inserts a new element at the front of the list
   * @param data The data to be prepended
   * @return ListOfInts that has the new element in the front
   */
  ListOfInts prepend(int data);

  /**
   * Inserts a new element in the end of the list
   * @param data The data to be appended
   * @return ListOfInts that has the new element in the end
   */
  ListOfInts append(int data);

  /**
   * Inserts a new element somewhere in the list
   * @param data The data to be inserted
   * @param index The index to insert the data to
   * @return ListOfInts that has the new element inserted at the index
   */
  ListOfInts insertAtIndex(int data, int index);

  /**
   * Gets the data at the specified index
   * @param index The index to get the data from
   * @return int at the specified index
   */
  int getDataAtIndex(int index);

  /**
   * Gets a list containing all but the first element
   * @return ListOfInts containing all but the first element
   */
  ListOfInts getRest();

  /**
   * Uses standard recursion to get the length of the list
   * @return int Length of the list
   */
  int getCountClassic();
  /**
   * Uses tail recursion to get the length of the list
   * @return int Length of the list
   */
  int getCountWithHelper();

  /**
   * Helper function to getCountWithHelper
   * @param acc accumulator for helper function
   * @return int Length of the list
   */
  int getCountHelper(int acc);

  /**
   * Returns the sum of the elements in the list
   * @return int the sum of the elements in the list
   */
  int getSum();
}


