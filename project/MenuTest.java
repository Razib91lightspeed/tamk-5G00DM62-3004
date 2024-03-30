// javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" MenuTest.java
// java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MenuTest


import org.junit.Test;
import static org.junit.Assert.*;

public class MenuTest {

    // Test cases for setName method
    @Test
    public void testSetName() {
        Menu menu = new Menu();
        menu.setName("Special Menu");
        assertEquals("Special Menu", menu.getName());
    }

    @Test
    public void testSetNameEmpty() {
        Menu menu = new Menu();
        menu.setName("");
        assertEquals("", menu.getName());
    }

    @Test
    public void testSetNameNull() {
        Menu menu = new Menu();
        menu.setName(null);
        assertNull(menu.getName());
    }

    @Test
    public void testSetNameMultipleWords() {
        Menu menu = new Menu();
        menu.setName("Dinner Specials");
        assertEquals("Dinner Specials", menu.getName());
    }

    // Test cases for setDescription method
    @Test
    public void testSetDescription() {
        Menu menu = new Menu();
        menu.setDescription("Delicious dishes for special occasions");
        assertEquals("Delicious dishes for special occasions", menu.getDescription());
    }

    @Test
    public void testSetDescriptionEmpty() {
        Menu menu = new Menu();
        menu.setDescription("");
        assertEquals("", menu.getDescription());
    }

    @Test
    public void testSetDescriptionNull() {
        Menu menu = new Menu();
        menu.setDescription(null);
        assertNull(menu.getDescription());
    }

    @Test
    public void testSetDescriptionMultipleLines() {
        Menu menu = new Menu();
        menu.setDescription("Starters\nMain Course\nDesserts");
        assertEquals("Starters\nMain Course\nDesserts", menu.getDescription());
    }

    // Test cases for setPrice method
    @Test
    public void testSetPrice() {
        Menu menu = new Menu();
        menu.setPrice(39.99);
        assertEquals(39.99, menu.getPrice(), 0.001);
    }

    @Test
    public void testSetPriceZero() {
        Menu menu = new Menu();
        menu.setPrice(0);
        assertEquals(0, menu.getPrice(), 0.001);
    }

    @Test
    public void testSetPriceNegative() {
        Menu menu = new Menu();
        menu.setPrice(-10.50);
        assertEquals(-10.50, menu.getPrice(), 0.001);
    }

    @Test
    public void testSetPriceMaxValue() {
        Menu menu = new Menu();
        menu.setPrice(Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, menu.getPrice(), 0.001);
    }

    // Test cases for setPortionSize method
    @Test
    public void testSetPortionSize() {
        Menu menu = new Menu();
        menu.setPortionSize("Large");
        assertEquals("Large", menu.getPortionSize());
    }

    @Test
    public void testSetPortionSizeEmpty() {
        Menu menu = new Menu();
        menu.setPortionSize("");
        assertEquals("", menu.getPortionSize());
    }

    @Test
    public void testSetPortionSizeNull() {
        Menu menu = new Menu();
        menu.setPortionSize(null);
        assertNull(menu.getPortionSize());
    }

    @Test
    public void testSetPortionSizeWithWhitespace() {
        Menu menu = new Menu();
        menu.setPortionSize("   ");
        assertEquals("   ", menu.getPortionSize());
    }

    // Test cases for setMenuItems method
    @Test
    public void testSetMenuItems() {
        Menu menu = new Menu();
        MenuItem item1 = new MenuItem("Pizza", "Delicious pizza", 12.99, "Regular");
        MenuItem item2 = new MenuItem("Burger", "Classic burger", 8.99, "Regular");
        menu.setMenuItems(new MenuItem[]{item1, item2});
        assertEquals(2, menu.getMenuItems().length);
    }

    @Test
    public void testSetMenuItemsEmpty() {
        Menu menu = new Menu();
        menu.setMenuItems(new MenuItem[]{});
        assertEquals(0, menu.getMenuItems().length);
    }

    @Test
    public void testSetMenuItemsNull() {
        Menu menu = new Menu();
        menu.setMenuItems(null);
        assertEquals(0, menu.getMenuItems().length);
    }

    @Test
    public void testSetMenuItemsWithItems() {
        Menu menu = new Menu();
        MenuItem item1 = new MenuItem("Pizza", "Delicious pizza", 12.99, "Regular");
        MenuItem item2 = new MenuItem("Burger", "Classic burger", 8.99, "Regular");
        menu.setMenuItems(new MenuItem[]{item1, item2});
        assertEquals(item1, menu.getMenuItems()[0]);
        assertEquals(item2, menu.getMenuItems()[1]);
    }


}
// End of file
