// javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" PaymentTest.java
// java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore PaymentTest

import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentTest {

    // Test cases for setPaymentMethod method
    @Test
    public void testSetPaymentMethod() {
        Payment payment = new Payment();
        payment.setPaymentMethod("Credit Card");
        assertEquals("Credit Card", payment.getPaymentMethod());
    }

    @Test
    public void testSetPaymentMethodEmpty() {
        Payment payment = new Payment();
        try {
            payment.setPaymentMethod("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Payment method cannot be empty", e.getMessage());
        }
    }

    @Test
    public void testSetPaymentMethodNull() {
        Payment payment = new Payment();
        try {
            payment.setPaymentMethod(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("Payment method cannot be null", e.getMessage());
        }
    }

    @Test
    public void testSetPaymentMethodMultipleWords() {
        Payment payment = new Payment();
        payment.setPaymentMethod("Debit Card");
        assertEquals("Debit Card", payment.getPaymentMethod());
    }

    // Test cases for setAmount method
    @Test
    public void testSetAmount() {
        Payment payment = new Payment();
        payment.setAmount(100.0);
        assertEquals(100.0, payment.getAmount(), 0.0);
    }

    @Test
    public void testSetAmountNegative() {
        Payment payment = new Payment();
        try {
            payment.setAmount(-50.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Amount cannot be negative", e.getMessage());
        }
    }

    @Test
    public void testSetAmountZero() {
        Payment payment = new Payment();
        payment.setAmount(0.0);
        assertEquals(0.0, payment.getAmount(), 0.0);
    }

    @Test
    public void testSetAmountLarge() {
        Payment payment = new Payment();
        payment.setAmount(999999999.99);
        assertEquals(999999999.99, payment.getAmount(), 0.0);
    }

    // Test cases for setStatus method
    @Test
    public void testSetStatus() {
        Payment payment = new Payment();
        payment.setStatus("Completed");
        assertEquals("Completed", payment.getStatus());
    }

    @Test
    public void testSetStatusNull() {
        Payment payment = new Payment();
        payment.setStatus(null);
        assertNull(payment.getStatus());
    }

    @Test
    public void testSetStatusEmpty() {
        Payment payment = new Payment();
        payment.setStatus("");
        assertEquals("", payment.getStatus());
    }

    @Test
    public void testSetStatusPending() {
        Payment payment = new Payment();
        payment.setStatus("Pending");
        assertEquals("Pending", payment.getStatus());
    }


        // Test methods for processPayment() method
    @Test
    public void testProcessPayment_AnotherScenario() {
        Payment payment = new Payment();
        payment.processPayment(456);
        // Add assertions or mock interactions as needed
    }

    @Test
    public void testProcessPayment_YetAnotherScenario() {
        Payment payment = new Payment();
        payment.processPayment(789);
        // Add assertions or mock interactions as needed
    }

    @Test
    public void testProcessPayment_FinalScenario() {
        Payment payment = new Payment();
        payment.processPayment(101112);
        // Add assertions or mock interactions as needed
    }

    // Test methods for processPayment() method
    @Test
    public void testProcessPayment_FourthScenario() {
        Payment payment = new Payment();
        payment.processPayment(131415);
        // Add assertions or mock interactions as needed
    }


        // Test cases for toString method


        @Test
        public void testToStringNonNullValues() {
            Payment payment = new Payment();
            payment.setPaymentMethod("Credit Card");
            payment.setAmount(100.0);
            payment.setStatus("Completed");
            String expectedString = "Payment Method: Credit Card\nAmount: 100.0\nStatus: Completed";
            assertEquals(expectedString, payment.toString());
        }
        @Test
    public void testToStringMethodOnly() {
        Payment payment = new Payment();
        payment.setPaymentMethod("Debit Card");
        String expectedString = "Payment Method: Debit Card\nAmount: 0.0\nStatus: null";
        assertEquals(expectedString, payment.toString());
    }

        @Test
        public void testToStringNullStatus() {
            Payment payment = new Payment();
            payment.setPaymentMethod("Cash");
            payment.setAmount(50.0);
            String expectedString = "Payment Method: Cash\nAmount: 50.0\nStatus: null";
            assertEquals(expectedString, payment.toString());
        }

        @Test
        public void testToStringLargeAmount() {
            Payment payment = new Payment();
            payment.setPaymentMethod("Cash");
            payment.setAmount(1000.0);
            payment.setStatus("Completed");
            String paymentString = payment.toString();
            assertTrue(paymentString.contains("Amount: 1000.0"));
        }
}
// End of file
