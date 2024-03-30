// javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" OrderTest.java
// java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore OrderTest

import org.junit.Test;
import static org.junit.Assert.*;

public class OrderTest {

    // Test methods for setOrderId() method
    @Test
    public void testSetOrderId_ValidId() {
        Order order = new Order();
        order.setOrderId(1001);
        assertEquals(1001, order.getOrderId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrderId_NegativeId() {
        Order order = new Order();
        order.setOrderId(-1001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrderId_ZeroId() {
        Order order = new Order();
        order.setOrderId(0);
    }

    @Test
    public void testSetOrderId_AnotherValidId() {
        Order order = new Order();
        order.setOrderId(2002);
        assertEquals(2002, order.getOrderId());
    }

    // Test methods for setCustomerId() method
    @Test
    public void testSetCustomerId_ValidId() {
        Order order = new Order();
        order.setCustomerId(1001);
        assertEquals(1001, order.getCustomerId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCustomerId_NegativeId() {
        Order order = new Order();
        order.setCustomerId(-1001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCustomerId_ZeroId() {
        Order order = new Order();
        order.setCustomerId(0);
    }

    @Test
    public void testSetCustomerId_AnotherValidId() {
        Order order = new Order();
        order.setCustomerId(2002);
        assertEquals(2002, order.getCustomerId());
    }

    // Test methods for setDeliveryAddress() method
    @Test
    public void testSetDeliveryAddress_ValidAddress() {
        Order order = new Order();
        DeliveryAddress address = new DeliveryAddress("123 Main St", "City", "12345");
        order.setDeliveryAddress(address);
        assertEquals(address, order.getDeliveryAddress());
    }

    @Test(expected = NullPointerException.class)
    public void testSetDeliveryAddress_NullAddress() {
        Order order = new Order();
        order.setDeliveryAddress(null);
    }

    @Test
    public void testSetDeliveryAddress_AnotherValidAddress() {
        Order order = new Order();
        DeliveryAddress address = new DeliveryAddress("456 Elm St", "City", "67890");
        order.setDeliveryAddress(address);
        assertEquals(address, order.getDeliveryAddress());
    }

        @Test
    public void testSetDeliveryAddress_YetAnotherValidAddress() {
        Order order = new Order();
        DeliveryAddress address = new DeliveryAddress("789 Oak St", "Town", "54321");
        order.setDeliveryAddress(address);
        assertEquals(address, order.getDeliveryAddress());
    }

    // Test methods for addMenuItem() method
@Test
public void testAddMenuItem_ValidItemAndQuantity() {
    Order order = new Order();
    MenuItem item = new MenuItem("Burger", "Delicious burger", 5.99, "Large");
    order.addMenuItem(item, 2);
    assertEquals(2, order.getItemCount());
}

@Test(expected = IllegalArgumentException.class)
public void testAddMenuItem_NullItem() {
    Order order = new Order();
    order.addMenuItem(null, 1);
}

@Test(expected = IllegalArgumentException.class)
public void testAddMenuItem_ZeroQuantity() {
    Order order = new Order();
    MenuItem item = new MenuItem("Pizza", "Tasty pizza", 8.99, "Medium");
    order.addMenuItem(item, 0);
}

@Test
public void testAddMenuItem_AnotherValidItemAndQuantity() {
    Order order = new Order();
    MenuItem item = new MenuItem("Salad", "Fresh salad", 4.99, "Small");
    order.addMenuItem(item, 3);
    assertEquals(3, order.getItemCount());
}


    // Test methods for setOrderType() method
    @Test
    public void testSetOrderType_DineIn() {
        Order order = new Order();
        order.setOrderType("dine-in");
        assertEquals("dine-in", order.getOrderType());
    }

    @Test
    public void testSetOrderType_Delivery() {
        Order order = new Order();
        order.setOrderType("delivery");
        assertEquals("delivery", order.getOrderType());
    }

    @Test
    public void testSetOrderType_AnotherValidType() {
        Order order = new Order();
        order.setOrderType("takeout");
        assertEquals("takeout", order.getOrderType());
    }

    @Test
    public void testSetOrderType_FinalValidType() {
        Order order = new Order();
        order.setOrderType("drive-thru");
        assertEquals("drive-thru", order.getOrderType());
    }
}
// End of file
