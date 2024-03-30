// javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" DeliveryAddressTest.java

// java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore DeliveryAddressTest

import org.junit.Test;
import static org.junit.Assert.*;

public class DeliveryAddressTest {

    // Test cases for setFirstName method
    @Test
    public void testSetFirstName() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setFirstName("John");
        assertEquals("John", deliveryAddress.getFirstName());
    }

    @Test
    public void testSetFirstNameEmpty() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setFirstName("");
        assertEquals("", deliveryAddress.getFirstName());
    }

    @Test
    public void testSetFirstNameNull() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setFirstName(null);
        assertNull(deliveryAddress.getFirstName());
    }

    @Test
    public void testSetFirstNameMultipleWords() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setFirstName("John Michael");
        assertEquals("John Michael", deliveryAddress.getFirstName());
    }

    // Test cases for setLastName method
    @Test
    public void testSetLastName() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setLastName("Doe");
        assertEquals("Doe", deliveryAddress.getLastName());
    }

    @Test
    public void testSetLastNameEmpty() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setLastName("");
        assertEquals("", deliveryAddress.getLastName());
    }

    @Test
    public void testSetLastNameNull() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setLastName(null);
        assertNull(deliveryAddress.getLastName());
    }

    @Test
    public void testSetLastNameMultipleWords() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setLastName("Smith Jr.");
        assertEquals("Smith Jr.", deliveryAddress.getLastName());
    }

    // Test cases for setCustomerId method
    @Test
    public void testSetCustomerIdPositive() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setCustomerId(123456);
        assertEquals(123456, deliveryAddress.getCustomerId());
    }

    @Test
    public void testSetCustomerIdZero() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setCustomerId(0);
        assertEquals(0, deliveryAddress.getCustomerId());
    }

    @Test
    public void testSetCustomerIdNegative() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setCustomerId(-789012);
        assertEquals(-789012, deliveryAddress.getCustomerId());
    }

    @Test
    public void testSetCustomerIdMaxValue() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setCustomerId(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, deliveryAddress.getCustomerId());
    }

    // Test cases for setAddress method
    @Test
    public void testSetAddressValid() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setAddress("123 Main St, City, Country");
        assertEquals("123 Main St, City, Country", deliveryAddress.getAddress());
    }

    @Test
    public void testSetAddressNull() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setAddress(null);
        assertNull(deliveryAddress.getAddress());
    }

    @Test
    public void testSetAddressEmpty() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setAddress("");
        assertEquals("", deliveryAddress.getAddress());
    }

    @Test
    public void testSetAddressWithSpace() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setAddress("123 Main St, City, Country");
        assertEquals("123 Main St, City, Country", deliveryAddress.getAddress());
    }

    // Test cases for setDeliveryInstructions method
    @Test
    public void testSetDeliveryInstructions() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setDeliveryInstructions("Ring the doorbell twice.");
        assertEquals("Ring the doorbell twice.", deliveryAddress.getDeliveryInstructions());
    }

    @Test
    public void testSetDeliveryInstructionsNull() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setDeliveryInstructions(null);
        assertNull(deliveryAddress.getDeliveryInstructions());
    }

    @Test
    public void testSetDeliveryInstructionsEmpty() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setDeliveryInstructions("");
        assertEquals("", deliveryAddress.getDeliveryInstructions());
    }

    @Test
    public void testSetDeliveryInstructionsWithSpace() {
        DeliveryAddress deliveryAddress = new DeliveryAddress("Street", "City", "PostalCode");
        deliveryAddress.setDeliveryInstructions("Leave package at the front door.");
        assertEquals("Leave package at the front door.", deliveryAddress.getDeliveryInstructions());
    }
}
// End of file
