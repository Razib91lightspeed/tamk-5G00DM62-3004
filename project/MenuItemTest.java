//  javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" MenuItemTest.java
//  java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MenuItemTest
import org.junit.Test;
import static org.junit.Assert.*;

public class MenuItemTest {

    // Test cases for getName method
    @Test
    public void testGetName() {
        MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", 12.99, "Regular");
        assertEquals("Pizza", menuItem.getName());
    }

    @Test
    public void testGetNameEmpty() {
        MenuItem menuItem = new MenuItem("", "Delicious pizza", 12.99, "Regular");
        assertEquals("", menuItem.getName());
    }

    @Test
    public void testGetNameNull() {
        MenuItem menuItem = new MenuItem(null, "Delicious pizza", 12.99, "Regular");
        assertNull(menuItem.getName());
    }

    @Test
    public void testGetNameMultipleWords() {
        MenuItem menuItem = new MenuItem("Cheese Burger", "Classic burger with cheese", 8.99, "Regular");
        assertEquals("Cheese Burger", menuItem.getName());
    }

    // Test cases for getDescription method
    @Test
    public void testGetDescription() {
        MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", 12.99, "Regular");
        assertEquals("Delicious pizza", menuItem.getDescription());
    }

    @Test
    public void testGetDescriptionEmpty() {
        MenuItem menuItem = new MenuItem("Pizza", "", 12.99, "Regular");
        assertEquals("", menuItem.getDescription());
    }

    @Test
    public void testGetDescriptionNull() {
        MenuItem menuItem = new MenuItem("Pizza", null, 12.99, "Regular");
        assertNull(menuItem.getDescription());
    }

    @Test
    public void testGetDescriptionMultipleLines() {
        MenuItem menuItem = new MenuItem("Pizza", "Tasty\nCrunchy\nDelicious", 12.99, "Regular");
        assertEquals("Tasty\nCrunchy\nDelicious", menuItem.getDescription());
    }

    // Test cases for getPrice method
    @Test
    public void testGetPrice() {
        MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", 12.99, "Regular");
        assertEquals(12.99, menuItem.getPrice(), 0.001);
    }

    @Test
    public void testGetPriceZero() {
        MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", 0, "Regular");
        assertEquals(0, menuItem.getPrice(), 0.001);
    }

    @Test
    public void testGetPriceNegative() {
        MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", -10.50, "Regular");
        assertEquals(-10.50, menuItem.getPrice(), 0.001);
    }

    @Test
    public void testGetPriceMaxValue() {
        MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", Double.MAX_VALUE, "Regular");
        assertEquals(Double.MAX_VALUE, menuItem.getPrice(), 0.001);
    }

    // Test cases for getPortionSize method
    @Test
    public void testGetPortionSize() {
        MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", 12.99, "Regular");
        assertEquals("Regular", menuItem.getPortionSize());
    }

    @Test
    public void testGetPortionSizeEmpty() {
        MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", 12.99, "");
        assertEquals("", menuItem.getPortionSize());
    }

    @Test
    public void testGetPortionSizeNull() {
        MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", 12.99, null);
        assertNull(menuItem.getPortionSize());
    }

    @Test
    public void testGetPortionSizeWithWhitespace() {
        MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", 12.99, "   ");
        assertEquals("   ", menuItem.getPortionSize());
    }

    // Test cases for getName method (additional)
    @Test
    public void testGetNameUpperCase() {
        MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", 12.99, "Regular");
        assertEquals("PIZZA", menuItem.getName().toUpperCase());
    }

    @Test
    public void testGetNameLowerCase() {
        MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", 12.99, "Regular");
        assertEquals("pizza", menuItem.getName().toLowerCase());
    }

    @Test
    public void testGetNameTrim() {
        MenuItem menuItem = new MenuItem("  Pizza  ", "Delicious pizza", 12.99, "Regular");
        assertEquals("Pizza", menuItem.getName().trim());
    }

    @Test
    public void testGetNameLength() {
        MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", 12.99, "Regular");
        assertTrue(menuItem.getName().length() > 0);
    }
}
// End of file
