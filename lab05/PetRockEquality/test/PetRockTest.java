import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Objects;

/**
 * Testing the equals and hashCode methods
 */
class PetRockTest {

  PetRock myRock;
  PetRock myRock2;
  PetRock copyRock;

  /**
   * Setting up all the objects before all the tests
   */
  @BeforeEach
  void setUp() {

    myRock = new PetRock("Rocky", 20);
    copyRock = new PetRock("Rocky", 20);
    myRock2 = new PetRock("Stony", 10);
  }

  /**
   * Testing if the equals method works as expected for two PetRocks
   */
  @Test
  void PetRockEqualityTest()
  {
    //Testing if two PetRocks with different names are equal
    PetRock myRockNewname = new PetRock("Rockie", 20);
    assertEquals(false, myRock.equals(myRockNewname));

    // Testing if two PetRocks with slightly different masses are equal
    PetRock myRockHeavier = new PetRock("Rocky", 20.00001);
    assertEquals(true, myRock.equals(myRockHeavier));

    //Testing if two PetRocks with slightly different masses but within the difference of 0.001 are equal
    myRockHeavier = new PetRock("Rocky", 20.001);
    assertEquals(false, myRock.equals(myRockHeavier));

    // Testing if two PetRocks that are naturally unhappy are equal and if a PetRock that is naturally unhappy is equal to a happy PetRock that has been petted
    assertEquals(true, myRock.equals(copyRock));
    myRock.petTheRock();
    assertEquals(false, myRock.equals(copyRock));

    //Testing if two completely different PetRocks are equal
    assertEquals(false, myRock.equals(myRock2));

    //Testing if two completely different objects are equal
    int myInt = 10;
    assertEquals(false, myRock2.equals(myInt));

  }

  /**
   * Testing if the hash functions work as expected for two PetRocks
   */
  @Test
  void PetRockHashFunctionTest()
  {
    //Testing if two PetRocks with different names have the same hash value
    PetRock myRockNewname = new PetRock("Rockie", 20);
    assertEquals(false, myRock.hashCode() == myRockNewname.hashCode());

    // Testing if two PetRocks with slightly different masses have the same hash value
    PetRock myRockHeavier = new PetRock("Rocky", 20.00001);
    assertEquals(true, myRock.hashCode() == myRockHeavier.hashCode());

    //Testing if two PetRocks with slightly different masses but within the difference of 0.001 have the same hash value
    myRockHeavier = new PetRock("Rocky", 20.001);
    assertEquals(false, myRock.hashCode() == myRockHeavier.hashCode());

    // Testing if two PetRocks that are naturally unhappy have the same hash value and if a PetRock that is naturally unhappy has the same hash value as a happy PetRock that has been petted
    assertEquals(true, myRock.hashCode() == copyRock.hashCode());
    myRock.petTheRock();
    assertEquals(false, myRock.hashCode() == copyRock.hashCode());

    //Testing if two completely different PetRocks have the same hash value
    assertEquals(false, myRock.hashCode() == myRock2.hashCode());

    //Testing if two completely different objects have the same hash value
    int myInt = 10;
    assertEquals(false, myRock2.hashCode() == Objects.hash(myInt));





  }
}