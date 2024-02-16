/**
 * The GeometryCalculator class calculates the area of a circle based on its radius.
 * It provides a method to calculate the area of a circle.
 *
 * @author Razib Hasan <razib.hasan@tuni.fi>
 * @version 2024.0131 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class Geometry {

    /**
     * Calculates the area of a circle based on its radius.
     *
     * @param radius The radius of the circle.
     * @return The area of the circle.
     */
    public double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Mains method to run the program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double radius = 5.0;
        Geometry geometryCalculator = new Geometry();
        double area = geometryCalculator.areaCircle(radius);
        System.out.println("Area of the circle: " + area);
    }
}
