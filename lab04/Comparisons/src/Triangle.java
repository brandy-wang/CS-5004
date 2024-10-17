/**
 * This class represents a triangle.  It defines all the operations mandated by
 * the Shape interface
 */


public class Triangle extends AbstractShape {
  /**
   * a variable that represents the second point of the triangle
   */
  protected Point2D secondreference;
  /**
   * a variable that represents the third point of the triangle
   */
  protected Point2D thirdreference;

  /**
   * Constructs a triangle object using the given three points
   * @param x1 x coordinate of the first point of this triangle
   * @param y1 y coordinate of the first point of this triangle
   * @param x2 x coordinate of the second point of this triangle
   * @param y2 y coordinate of the second point of this triangle
   * @param x3 x coordinate of the third point of this triangle
   * @param y3 y coordinate of the third point of this triangle
   * @throws IllegalArgumentException when there are two identical points
   */
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) throws IllegalArgumentException {
    super(new Point2D(x1,y1));
    secondreference = new Point2D(x2,y2);
    thirdreference = new Point2D(x3,y3);

    //Using the equation to calculate distance between two points, if it's 0 that means the points are identical
    if (reference.distanceFromPoint(secondreference)==0 ||
        reference.distanceFromPoint(thirdreference)==0 ||
        secondreference.distanceFromPoint(thirdreference)==0 )
    {
      throw new IllegalArgumentException();
    }
  }


  @Override
  public double area() {
    // Area equation from 3 points
    // A = (1/2) |x1(y2 − y3) + x2(y3 − y1) + x3(y1 − y2)|
    double x1 = reference.getX();
    double y1 = reference.getY();
    double x2 = secondreference.getX();
    double y2 = secondreference.getY();
    double x3 = thirdreference.getX();
    double y3 = thirdreference.getY();
    return 0.5 * Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
  }

  @Override
  public double perimeter() {
    return reference.distanceFromPoint(secondreference) +
        reference.distanceFromPoint(thirdreference) +
        secondreference.distanceFromPoint(thirdreference);
  }

  @Override
  public Shape resize(double factor) {
    double sqrtFactor = Math.sqrt(factor);
    double newX2 = reference.getX() + (secondreference.getX() - reference.getX()) * sqrtFactor;
    double newY2 = reference.getY() + (secondreference.getY() - reference.getY()) * sqrtFactor;
    double newX3 = reference.getX() + (thirdreference.getX() - reference.getX()) * sqrtFactor;
    double newY3 = reference.getY() + (thirdreference.getY() - reference.getY()) * sqrtFactor;
    return new Triangle(reference.getX(), reference.getY(), newX2, newY2, newX3, newY3);
  }


  /**
   * A toString that gives the three points of the triangle
   * @return the three points of the triangle in the format of a string
   */
  public String toString()
  {
    return String.format("Triangle: point 1 (%.3f,%.3f) point 2 (%.3f,%.3f) point 3 (%.3f,%.3f)",
        reference.getX(), reference.getY(), secondreference.getX(), secondreference.getY(), thirdreference.getX(), thirdreference.getY());
  }
}

/* Answer to question 3:
*  Q: Which parts of which files would have needed to be modified?
*  A: AbstractShape's compareTo function will need to be modified
*  Q: If it were not for sharing code via AbstractShape.java, how many files would have needed modification (assuming you have concrete Shapes for Rectangle, Circle, and Triangle)?
*  A: Three files: Rectangle, Circle, and Triangle need to be changed if the compareTo function in AbstractShape doesn't need to be changed and four files including AbstractShape need to be changed if it does
 */
