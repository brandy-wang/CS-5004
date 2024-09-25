/**
 * This class represents a pair of shoes. Shoes has a type, a color, a brand and it's size
 */


public class Shoe {
  private String type;
  private String color;
  private String brand;
  private double size;

  /**
   * Construct shoes object that has the provided attributes
   *
   * @param type the type of the shoes
   * @param color the color of the shoes
   * @param brand the brand of the shoes
   * @param size the size of the shoes
   */
  public Shoe(String type, String color, String brand, double size) {
    this.type = type;
    this.color = color;
    this.brand = brand;
    this.size = size;
  }

  /**
   * Return the type of the shoes
   *
   * @return the type of the shoes
   */
  public String getType() {
    return type;
  }

  /**
   * Return the color of the shoes
   *
   * @return the color of the shoes
   */
  public String getColor() {
    return color;
  }
  /**
   * Return the brand of the shoes
   *
   * @return the brand of the shoes
   */
  public String getBrand() {
    return brand;
  }
  /**
   * Return the size of the shoes
   *
   * @return the size of the shoes
   */
  public double getSize() {
    return size;
  }

  /**
   * Return a formatted string that contains the info of this project.
   * The string should be in the following format:
   * <p>
   * Type: [type of the shoes]
   * Color: [color of the shoes]
   * Brand: [brand of the shoes]
   * Size: [size of the shoes]
   */

  public String toString(){
    String str;
    str = "Type: " + this.type + "\n" + "Color: "+ this.color + "\n" + "Brand: " + this.brand + "\n";
    str = str + String.format("Size: %.2f", size);
    return str;
  }

}






