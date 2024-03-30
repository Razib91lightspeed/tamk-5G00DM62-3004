// javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" CustomerTest.java

// java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore CustomerTest


import org.junit.Test;
import static org.junit.Assert.*;


public class CustomerTest {

    // Test cases for setFirstName method
    @Test
    public void testSetFirstName() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        assertEquals("John", customer.getFirstName());
    }

    @Test
    public void testSetFirstNameEmpty() {
        Customer customer = new Customer();
        customer.setFirstName("");
        assertEquals("", customer.getFirstName());
    }

    @Test
    public void testSetFirstNameNull() {
        Customer customer = new Customer();
        customer.setFirstName(null);
        assertNull(customer.getFirstName());
    }

    @Test
    public void testSetFirstNameMultipleWords() {
        Customer customer = new Customer();
        customer.setFirstName("John Michael");
        assertEquals("John Michael", customer.getFirstName());
    }

    // Test cases for setLastName method
    @Test
    public void testSetLastName() {
        Customer customer = new Customer();
        customer.setLastName("Doe");
        assertEquals("Doe", customer.getLastName());
    }

    @Test
    public void testSetLastNameEmpty() {
        Customer customer = new Customer();
        customer.setLastName("");
        assertEquals("", customer.getLastName());
    }

    @Test
    public void testSetLastNameNull() {
        Customer customer = new Customer();
        customer.setLastName(null);
        assertNull(customer.getLastName());
    }

    @Test
    public void testSetLastNameMultipleWords() {
        Customer customer = new Customer();
        customer.setLastName("Smith Jr.");
        assertEquals("Smith Jr.", customer.getLastName());
    }


    // Test cases for setCustomerId method
    @Test
    public void testSetCustomerIdPositive() {
        Customer customer = new Customer();
        customer.setCustomerId(123456);
        assertEquals(123456, customer.getCustomerId());
    }

    @Test
    public void testSetCustomerIdZero() {
        Customer customer = new Customer();
        customer.setCustomerId(0);
        assertEquals(0, customer.getCustomerId());
    }

    @Test
    public void testSetCustomerIdNegative() {
        Customer customer = new Customer();
        customer.setCustomerId(-789012);
        assertEquals(-789012, customer.getCustomerId());
    }

    @Test
    public void testSetCustomerIdMaxValue() {
        Customer customer = new Customer();
        customer.setCustomerId(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, customer.getCustomerId());
    }

    // Test cases for setAddress method
    @Test
    public void testSetAddressValid() {
        Customer customer = new Customer();
        customer.setAddress("123 Main St, City, Country");
        assertEquals("123 Main St, City, Country", customer.getAddress());
    }

    @Test
    public void testSetAddressNull() {
        Customer customer = new Customer();
        customer.setAddress(null);
        assertNull(customer.getAddress());
    }

    @Test
    public void testSetAddressEmpty() {
        Customer customer = new Customer();
        customer.setAddress("");
        assertEquals("", customer.getAddress());
    }

    @Test
    public void testSetAddressWithSpace() {
        Customer customer = new Customer();
        customer.setAddress("123 Main St, City, Country");
        assertEquals("123 Main St, City, Country", customer.getAddress());
    }


    // Test cases for placeOrder method
    @Test
    public void testPlaceOrderSuccess() {
        Customer customer = new Customer();
        Menu menu = new Menu();
        // Assuming the menu has items
        MenuItem item1 = new MenuItem("Pizza", "Delicious pizza", 12.99, "Regular");
        MenuItem item2 = new MenuItem("Burger", "Classic burger", 8.99, "Regular");
        menu.setMenuItems(new MenuItem[]{item1, item2});
        boolean orderPlaced = customer.placeOrder(menu, 2); // Placing an order for 2 pizzas
        assertTrue(orderPlaced);
    }

    @Test
    public void testPlaceOrderNoMenu() {
        Customer customer = new Customer();
        Menu menu = new Menu(); // Empty menu
        boolean orderPlaced = customer.placeOrder(menu, 2); // Trying to place an order with an empty menu
        assertFalse(orderPlaced);
    }

    @Test
    public void testPlaceOrderZeroQuantity() {
        Customer customer = new Customer();
        Menu menu = new Menu();
        // Assuming the menu has items
        MenuItem item1 = new MenuItem("Pizza", "Delicious pizza", 12.99, "Regular");
        MenuItem item2 = new MenuItem("Burger", "Classic burger", 8.99, "Regular");
        menu.setMenuItems(new MenuItem[]{item1, item2});
        boolean orderPlaced = customer.placeOrder(menu, 0); // Trying to place an order with zero quantity
        assertFalse(orderPlaced);
    }

    @Test
    public void testPlaceOrderInvalidQuantity() {
        Customer customer = new Customer();
        Menu menu = new Menu();
        // Assuming the menu has items
        MenuItem item1 = new MenuItem("Pizza", "Delicious pizza", 12.99, "Regular");
        MenuItem item2 = new MenuItem("Burger", "Classic burger", 8.99, "Regular");
        menu.setMenuItems(new MenuItem[]{item1, item2});
        boolean orderPlaced = customer.placeOrder(menu, -1); // Trying to place an order with negative quantity
        assertFalse(orderPlaced);
    }

}
// End of file
