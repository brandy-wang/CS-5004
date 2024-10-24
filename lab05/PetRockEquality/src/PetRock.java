import java.util.Objects;

/**
 * PetRock is a class based on an ancient fad.
 * <p></p>
 * The purpose is to practice equals and hashCode
 */
public class PetRock {
  private final String name;
  private boolean happiness;
  private final double mass;

  /**
   * Pet Rocks are created with a name and mass
   * <p></p>
   * @param name is a String
   * @param mass is a double
   * Both are final and cannot be changed
   * There is also a boolean field for happiness
   * Pet Rocks are born unhappy but become happy
   * once they have been petted.
   */
  public PetRock(String name, double mass) {
    this.name = name;
    this.happiness = false;
    this.mass = mass;
  }

  public String getName() {
    return name;
  }

  public boolean getHappiness() {
    return happiness;
  }

  public void petTheRock() {
    this.happiness = true;
  }

  public double getMass() {
    return mass;
  }

  /**
   * Two PetRocks are considered equal when:
   * 1. The name fields are equal
   * 2. The happiness fields are equal
   * 3. The mass fields are equal
   * 4. The two objects being compared are both PetRocks
   * @param obj the object to compare with this one
   * @return true if equal, false if not equal
   */
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof PetRock other) {
      boolean namesAreEqual = this.name.equals(other.name);
      boolean happinessIsEqual = this.happiness == other.happiness;
      boolean massIsEqual = Math.abs(this.mass - other.mass) < 0.001;
      return namesAreEqual && happinessIsEqual && massIsEqual;
    }
    else
    {
      return false;
    }
  }

  /**
   * Hashcode function returns a hash of the object
   * @return a hash of the object
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, happiness, String.format("%.3f", mass));
  }
}
