// javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" DeliveryPersonTest.java
// java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore DeliveryPersonTest
import org.junit.Test;
import static org.junit.Assert.*;

public class DeliveryPersonTest {

    // Test cases for setId method
    @Test
    public void testSetId() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setId(123);
        assertEquals(123, deliveryPerson.getId());
    }

    @Test
    public void testSetIdNegative() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setId(-456);
        assertEquals(-456, deliveryPerson.getId());
    }

    @Test
    public void testSetIdZero() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setId(0);
        assertEquals(0, deliveryPerson.getId());
    }

    @Test
    public void testSetIdMaxValue() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setId(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, deliveryPerson.getId());
    }

    // Test cases for setOrderId method
    @Test
    public void testSetOrderId() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setOrderId(789);
        assertEquals(789, deliveryPerson.getOrderId());
    }

    @Test
    public void testSetOrderIdNegative() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setOrderId(-101);
        assertEquals(-101, deliveryPerson.getOrderId());
    }

    @Test
    public void testSetOrderIdZero() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setOrderId(0);
        assertEquals(0, deliveryPerson.getOrderId());
    }

    @Test
    public void testSetOrderIdMaxValue() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setOrderId(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, deliveryPerson.getOrderId());
    }

    // Test cases for setStatus method
    @Test
    public void testSetStatus() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setStatus("On route");
        assertEquals("On route", deliveryPerson.getStatus());
    }

    @Test
    public void testSetStatusEmpty() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setStatus("");
        assertEquals("", deliveryPerson.getStatus());
    }

    @Test
    public void testSetStatusNull() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setStatus(null);
        assertNull(deliveryPerson.getStatus());
    }

    @Test
    public void testSetStatusSpecialCharacters() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setStatus("Busy - delivering orders!");
        assertEquals("Busy - delivering orders!", deliveryPerson.getStatus());
    }

    // Test cases for updateLocation method
    @Test
    public void testUpdateLocationValid() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        Location location = new Location(40.7128, -74.0060); // Valid latitude and longitude
        deliveryPerson.updateLocation(location);
        assertEquals(location, deliveryPerson.getLocation());
    }

    @Test
    public void testUpdateLocationNull() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.updateLocation(null);
        assertNull(deliveryPerson.getLocation());
    }

    @Test
    public void testUpdateLocationValidCoordinates() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        Location location = new Location(37.7749, -122.4194); // Valid latitude and longitude for San Francisco
        deliveryPerson.updateLocation(location);
        assertEquals(location, deliveryPerson.getLocation());
    }

    @Test
    public void testUpdateLocationInvalidCoordinates() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        Location location = new Location(-91.0, -181.0); // Create a Location object with invalid coordinates
        deliveryPerson.updateLocation(location);
        assertNull(deliveryPerson.getLocation()); // Verify that the returned Location object is null
    }

    // Test cases for toString method
    @Test
    public void testToStringWithNullLocation() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setId(123);
        deliveryPerson.setOrderId(789);
        deliveryPerson.setStatus("On route");
        String expected = "Delivery Person Information:" +
                "\nID: 123" +
                "\nOrder ID: 789" +
                "\nStatus: On route" +
                "\nLocation: null";
        assertEquals(expected, deliveryPerson.toString());
    }

    @Test
    public void testToStringWithEmptyStatus() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setId(456);
        deliveryPerson.setOrderId(321);
        deliveryPerson.setStatus("");
        Location location = new Location(34.0522, -118.2437);
        deliveryPerson.updateLocation(location);
        String expected = "Delivery Person Information:" +
                "\nID: 456" +
                "\nOrder ID: 321" +
                "\nStatus: " +
                "\nLocation: (34.0522, -118.2437)";
        assertEquals(expected, deliveryPerson.toString());
    }

    @Test
    public void testToStringWithNoLocation() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        deliveryPerson.setId(789);
        deliveryPerson.setOrderId(123);
        deliveryPerson.setStatus("Delivering");
        String expected = "Delivery Person Information:" +
                "\nID: 789" +
                "\nOrder ID: 123" +
                "\nStatus: Delivering" +
                "\nLocation: null";
        assertEquals(expected, deliveryPerson.toString());
    }

    @Test
    public void testToStringWithNullValues() {
        DeliveryPerson deliveryPerson = new DeliveryPerson();
        String expected = "Delivery Person Information:" +
                "\nID: 0" +
                "\nOrder ID: 0" +
                "\nStatus: " + // Change null to empty string
                "\nLocation: null";
        assertEquals(expected, deliveryPerson.toString());
    }

}
// End of file
