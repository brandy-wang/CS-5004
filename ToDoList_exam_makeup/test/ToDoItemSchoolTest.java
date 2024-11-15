import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoItemSchoolTest {

  ToDoItemSchool item1;
  ToDoItemSchool item2;
  ToDoItemSchool item3;

  @BeforeEach
  void setUp() {
    //  STUDENT TO IMPLEMENT AS NEEDED FOR THE TESTS BELOW
     item1 = new ToDoItemSchool("Math homework", Importance.HIGH, 5, true);
     item2 = new ToDoItemSchool("Math homework", Importance.HIGH, 5, false);
     item3 = new ToDoItemSchool("Science project", Importance.MEDIUM, 3, true);
  }

  @Test
  void getRequired() {
    // STUDENT TO IMPLEMENT THIS TEST WITH 1 ASSERTION
    assertTrue(item1.getRequired(), "The 'required' field should be true for item1");
  }

  @Test
  void testToString() {
    // STUDENT TO IMPLEMENT THIS TEST WITH 1 ASSERTION
    // Test the 'toString' method on item1
    assertEquals("ToDoItem: Math homework Importance: HIGH Urgency: 5 required: true", item1.toString(), "The toString() method should return the correct string format");
  }
}