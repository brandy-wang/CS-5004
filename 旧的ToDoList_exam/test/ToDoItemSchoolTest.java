import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoItemSchoolTest {

  @BeforeEach
  void setUp() {
    //  STUDENT TO IMPLEMENT AS NEEDED FOR THE TESTS BELOW
    ToDoItemSchool item = new ToDoItemSchool("Math Homework", Importance.HIGH, 5, true);
    assertEquals("Math Homework", item.getDescription());
    assertEquals(Importance.HIGH, item.getImportance());
    assertEquals(5, item.getUrgency());
    assertTrue(item.getRequired());

  }

  @Test
  void getRequired() {
    // STUDENT TO IMPLEMENT THIS TEST WITH 1 ASSERTION


  }

  @Test
  void testToString() {
    // STUDENT TO IMPLEMENT THIS TEST WITH 1 ASSERTION
    ToDoItemSchool item = new ToDoItemSchool("Math Homework", Importance.HIGH, 5, true);
    String expected = "ToDoItem: Math Homework Importance: HIGH Urgency: 5 Required: true";
    assertEquals(expected, item.toString());
  }

  }
}

  }
}
