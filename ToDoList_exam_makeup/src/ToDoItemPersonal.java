import java.util.List;
import java.util.Objects;

/**
 * School items are like other ToDos, but need prepTime, a double
 * <p></p>
 * This requires overriding the toString method
 */

// ToDoItemAbs is a class instead of an interface so it cannot be implemented
    // Here change implements to extends
 public class ToDoItemPersonal extends ToDoItemAbs {
  //description, importance and urgency were already declared in ToDoItemAbs so should not be declared again
    //Delete the declarations
  private final double prepTime;

  public ToDoItemPersonal(String description, Importance importance,
      int urgency, double prepTime ) {
      //The order of urgency and importance should be swapped following the same order as in ToDoItemSchool
      // Here it should be (description, importance, urgency)
      super(description, importance, urgency);
    this.prepTime = prepTime;

  }

  /**
   * School items need estimated time needed to prepare
   *
   * @return prepTime -- a double -- in minutes
   */
  public double getPrepTime() {
    return this.prepTime;
  }

  @Override
  // The equals method compares objects directly (e.g., this.getDescription().equals(itm.getDescription())),
  // but if any of the fields are null, it will result in a NullPointerException.
  //To fix, use Objects.equals() to safely compare objects.
  public boolean equals(Object obj)
  // This signature doesn't override the equals method from the Object class
  // To fix, change the method signature to public boolean equals(Object obj)
  {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ToDoItemPersonal itm = (ToDoItemPersonal) obj;
    return Objects.equals(this.getDescription(), itm.getDescription()) &&
        this.getUrgency() == itm.getUrgency() &&
        this.getImportance() == itm.getImportance() &&
        Double.compare(this.getPrepTime(), itm.getPrepTime()) == 0;

  }

  @Override
  // The toString method is missing a return statement. It constructs a string str, but does not return it.
  //How to fix: Add a return str; at the end of the method
  public String toString() {
    String str = "ToDoItem: "+this.getDescription();
    str += " Importance: "+this.getImportance()+" Urgency: "+this.getUrgency();
    str += " PrepTime: "+this.getPrepTime();
    return str;
  }
}
