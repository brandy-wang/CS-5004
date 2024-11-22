public abstract class ToDoItemAbs implements ToDoItem, Comparable<ToDoItem> {

  protected String description;
  protected int urgency;
  protected Importance importance;


  /**
   * Constructs a ToDoItemAbs with the specified description, importance, and urgency.
   *
   * @param description the description of the to-do item
   * @param importance  the importance level of the to-do item (LOW, MEDIUM, HIGH)
   * @param urgency     the urgency level of the to-do item as an integer
   */
  public ToDoItemAbs(String description,
      Importance importance,
      int urgency) {
    this.description = description;
    this.importance = importance;
    this.urgency = urgency;
  }

  /**
   * Returns the description of this item
   *
   * @return the description of the to-do item
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Returns the importance of this item
   * <p></p>
   *
   * @return Importance (an enum: LOW, MEDIUM, or HIGH)
   */
  @Override
  public Importance getImportance() {
    return this.importance;
  }

  /**
   * Returns the urgency of this item as an int
   *
   * @return urgency of this item as an int
   */
  @Override
  public int getUrgency() {
    return this.urgency;
  }

  /**
   * Sets the urgency of this item
   *
   * @param urgency the new urgency level for this item
   */

  public void setUrgency(int urgency) {

    this.urgency = urgency;
  }

  /**
   * Comparable Interface for sorting by importance
   *
   * @param other -- a ToDoItem
   * @return negative, 0, or positive int for LOW, MEDIUM, or HIGH
   */
  @Override
  public int compareTo(ToDoItem other) {
    // STUDENT TO IMPLEMENT THIS METHOD
    return this.importance.compareTo(other.getImportance());
  }
}








