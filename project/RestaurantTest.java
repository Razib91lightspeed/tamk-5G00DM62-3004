// javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" RestaurantTest.java
// java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore RestaurantTest

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    // Test cases for setName method
    @Test
    public void testSetName() {
        Restaurant restaurant = new Restaurant();
        restaurant.setName("Food Haven");
        assertEquals("Food Haven", restaurant.getName());
    }

    @Test
    public void testSetNameEmpty() {
        Restaurant restaurant = new Restaurant();
        restaurant.setName("");
        assertEquals("", restaurant.getName());
    }

    @Test
    public void testSetNameNull() {
        Restaurant restaurant = new Restaurant();
        restaurant.setName(null);
        assertNull(restaurant.getName());
    }

    @Test
    public void testSetNameMultipleWords() {
        Restaurant restaurant = new Restaurant();
        restaurant.setName("Delicious Bites");
        assertEquals("Delicious Bites", restaurant.getName());
    }

    // Test cases for setId method
    @Test
    public void testSetIdPositive() {
        Restaurant restaurant = new Restaurant();
        restaurant.setId(123456);
        assertEquals(123456, restaurant.getId());
    }

    @Test
    public void testSetIdZero() {
        Restaurant restaurant = new Restaurant();
        restaurant.setId(0);
        assertEquals(0, restaurant.getId());
    }

    @Test
    public void testSetIdNegative() {
        Restaurant restaurant = new Restaurant();
        restaurant.setId(-789012);
        assertEquals(-789012, restaurant.getId());
    }

    @Test
    public void testSetIdMaxValue() {
        Restaurant restaurant = new Restaurant();
        restaurant.setId(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, restaurant.getId());
    }

    // Test cases for setAddress method
    @Test
    public void testSetAddressValid() {
        Restaurant restaurant = new Restaurant();
        restaurant.setAddress("123 Main St, City, Country");
        assertEquals("123 Main St, City, Country", restaurant.getAddress());
    }

    @Test
    public void testSetAddressNull() {
        Restaurant restaurant = new Restaurant();
        restaurant.setAddress(null);
        assertNull(restaurant.getAddress());
    }

    @Test
    public void testSetAddressEmpty() {
        Restaurant restaurant = new Restaurant();
        restaurant.setAddress("");
        assertEquals("", restaurant.getAddress());
    }

    @Test
    public void testSetAddressWithSpace() {
        Restaurant restaurant = new Restaurant();
        restaurant.setAddress("123 Main St, City, Country");
        assertEquals("123 Main St, City, Country", restaurant.getAddress());
    }

    // Test cases for setDeliveryService method
    @Test
    public void testSetDeliveryServiceTrue() {
        Restaurant restaurant = new Restaurant();
        restaurant.setDeliveryService(true);
        assertTrue(restaurant.hasDeliveryService());
    }

    @Test
    public void testSetDeliveryServiceFalse() {
        Restaurant restaurant = new Restaurant();
        restaurant.setDeliveryService(false);
        assertFalse(restaurant.hasDeliveryService());
    }

    @Test
    public void testSetDeliveryServiceTwice() {
        Restaurant restaurant = new Restaurant();
        restaurant.setDeliveryService(true);
        restaurant.setDeliveryService(false);
        assertFalse(restaurant.hasDeliveryService());
    }

    @Test
    public void testSetDeliveryServiceAlternate() {
        Restaurant restaurant = new Restaurant();
        restaurant.setDeliveryService(true);
        assertTrue(restaurant.hasDeliveryService());
        restaurant.setDeliveryService(false);
        assertFalse(restaurant.hasDeliveryService());
    }
   // Test cases for the menu field
   @Test
   public void testMenuInitialization() {
       Restaurant restaurant = new Restaurant();
       assertNull(restaurant.getMenu());
   }

   @Test
   public void testSetMenu() {
       Restaurant restaurant = new Restaurant();
       Menu menu = new Menu();
       restaurant.setMenu(menu);
       assertEquals(menu, restaurant.getMenu());
   }

   @Test
   public void testSetMenuTwice() {
       Restaurant restaurant = new Restaurant();
       Menu menu1 = new Menu();
       Menu menu2 = new Menu();
       restaurant.setMenu(menu1);
       restaurant.setMenu(menu2);
       assertEquals(menu2, restaurant.getMenu());
   }

   @Test
   public void testMenuUpdate() {
       Restaurant restaurant = new Restaurant();
       Menu menu = new Menu();
       MenuItem menuItem = new MenuItem("Pizza", "Delicious pizza", 12.99, "Regular");
       menu.setMenuItems(new MenuItem[]{menuItem});
       restaurant.setMenu(menu);
       assertEquals(menuItem, restaurant.getMenu().getMenuItems()[0]);
   }
}
// End of file
