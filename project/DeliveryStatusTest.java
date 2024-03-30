//  javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" DeliveryStatusTest.java
// java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore DeliveryStatusTest
import org.junit.Test;
import static org.junit.Assert.*;

public class DeliveryStatusTest {

    // Test cases for setOrderId method
    @Test
    public void testSetOrderId() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setOrderId(789);
        assertEquals(789, deliveryStatus.getOrderId());
    }

    @Test
    public void testSetOrderIdNegative() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setOrderId(-789);
        assertEquals(-789, deliveryStatus.getOrderId());
    }

    @Test
    public void testSetOrderIdZero() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setOrderId(0);
        assertEquals(0, deliveryStatus.getOrderId());
    }

    @Test
    public void testSetOrderIdMaxValue() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setOrderId(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, deliveryStatus.getOrderId());
    }

    // Test cases for setStatus method
    @Test
    public void testSetStatus() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setStatus(DeliveryStatus.DELIVERED);
        assertEquals(DeliveryStatus.DELIVERED, deliveryStatus.getStatus());
    }

    @Test
    public void testSetStatusInProgress() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.DELIVERED, 456);
        deliveryStatus.setStatus(DeliveryStatus.IN_PROGRESS);
        assertEquals(DeliveryStatus.IN_PROGRESS, deliveryStatus.getStatus());
    }

    @Test
    public void testSetStatusFailed() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setStatus(DeliveryStatus.FAILED);
        assertEquals(DeliveryStatus.FAILED, deliveryStatus.getStatus());
    }

        @Test
    public void testSetStatusWithCustomValue() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setStatus(4);
        assertEquals(4, deliveryStatus.getStatus());
    }


    // Test cases for setDeliveryPersonId method
    @Test
    public void testSetDeliveryPersonId() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setDeliveryPersonId(789);
        assertEquals(789, deliveryStatus.getDeliveryPersonId());
    }

    @Test
    public void testSetDeliveryPersonIdNegative() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setDeliveryPersonId(-789);
        assertEquals(-789, deliveryStatus.getDeliveryPersonId());
    }

    @Test
    public void testSetDeliveryPersonIdZero() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setDeliveryPersonId(0);
        assertEquals(0, deliveryStatus.getDeliveryPersonId());
    }

    @Test
    public void testSetDeliveryPersonIdMaxValue() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setDeliveryPersonId(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, deliveryStatus.getDeliveryPersonId());
    }

    // Additional test cases for setOrderId method
    @Test
    public void testSetOrderIdLargeValue() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setOrderId(999999);
        assertEquals(999999, deliveryStatus.getOrderId());
    }

    @Test
    public void testSetOrderIdMinValue() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setOrderId(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, deliveryStatus.getOrderId());
    }

    @Test
    public void testSetOrderIdRandomValue() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setOrderId(987654);
        assertEquals(987654, deliveryStatus.getOrderId());
    }

    @Test
    public void testSetOrderIdZeroAfterUpdate() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setOrderId(999);
        deliveryStatus.setOrderId(0);
        assertEquals(0, deliveryStatus.getOrderId());
    }

    // Additional test cases for setStatus method
    @Test
    public void testSetStatusCustomValue() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setStatus(5);
        assertEquals(5, deliveryStatus.getStatus());
    }

    @Test
    public void testSetStatusNegative() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setStatus(-2);
        assertEquals(-2, deliveryStatus.getStatus());
    }

    @Test
    public void testSetStatusRandomValue() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.IN_PROGRESS, 456);
        deliveryStatus.setStatus(10);
        assertEquals(10, deliveryStatus.getStatus());
    }

    @Test
    public void testSetStatusInProgressAfterFailed() {
        DeliveryStatus deliveryStatus = new DeliveryStatus(123, DeliveryStatus.FAILED, 456);
        deliveryStatus.setStatus(DeliveryStatus.IN_PROGRESS);
        assertEquals(DeliveryStatus.IN_PROGRESS, deliveryStatus.getStatus());
    }
}
// End of file
