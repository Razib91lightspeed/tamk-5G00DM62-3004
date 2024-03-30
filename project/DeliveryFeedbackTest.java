// javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" DeliveryFeedbackTest.java

// java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore DeliveryFeedbackTest
import org.junit.Test;
import static org.junit.Assert.*;

public class DeliveryFeedbackTest {

    // Test cases for setOrderId method
    @Test
    public void testSetOrderId() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setOrderId(123456);
        assertEquals(123456, feedback.getOrderId());
    }

    @Test
    public void testSetOrderIdNegative() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setOrderId(-789012);
        assertEquals(-789012, feedback.getOrderId());
    }

    @Test
    public void testSetOrderIdZero() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setOrderId(0);
        assertEquals(0, feedback.getOrderId());
    }

    @Test
    public void testSetOrderIdMaxValue() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setOrderId(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, feedback.getOrderId());
    }

    // Test cases for setRestaurantId method
    @Test
    public void testSetRestaurantId() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setRestaurantId(12345);
        assertEquals(12345, feedback.getRestaurantId());
    }

    @Test
    public void testSetRestaurantIdNegative() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setRestaurantId(-67890);
        assertEquals(-67890, feedback.getRestaurantId());
    }

    @Test
    public void testSetRestaurantIdZero() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setRestaurantId(0);
        assertEquals(0, feedback.getRestaurantId());
    }

    @Test
    public void testSetRestaurantIdMaxValue() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setRestaurantId(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, feedback.getRestaurantId());
    }

    // Test cases for setDeliveryRating method
    @Test
    public void testSetDeliveryRating() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setDeliveryRating(5);
        assertEquals(5, feedback.getDeliveryRating());
    }

    @Test
    public void testSetDeliveryRatingNegative() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setDeliveryRating(-1);
        assertEquals(-1, feedback.getDeliveryRating());
    }

    @Test
    public void testSetDeliveryRatingZero() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setDeliveryRating(0);
        assertEquals(0, feedback.getDeliveryRating());
    }

    @Test
    public void testSetDeliveryRatingMaxValue() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setDeliveryRating(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, feedback.getDeliveryRating());
    }

    // Test cases for setCustomerReview method
    @Test
    public void testSetCustomerReview() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setCustomerReview("Excellent service!");
        assertEquals("Excellent service!", feedback.getCustomerReview());
    }

    @Test
    public void testSetCustomerReviewEmpty() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setCustomerReview("");
        assertEquals("", feedback.getCustomerReview());
    }

    @Test
    public void testSetCustomerReviewNull() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setCustomerReview(null);
        assertNull(feedback.getCustomerReview());
    }

    @Test
    public void testSetCustomerReviewSpecialCharacters() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setCustomerReview("Great experience! 5/5");
        assertEquals("Great experience! 5/5", feedback.getCustomerReview());
    }

    // Test cases for recordFeedback method
    @Test
    public void testRecordFeedbackWithValidData() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setOrderId(123456);
        feedback.setRestaurantId(789012);
        feedback.setDeliveryRating(5);
        feedback.setCustomerReview("Excellent service!");

        feedback.recordFeedback();

        // Add assertions here to verify the logic performed by recordFeedback
    }

    @Test
    public void testRecordFeedbackWithInvalidData() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        // Set only order ID, leaving other fields unset
        feedback.setOrderId(123456);

        feedback.recordFeedback();

        // Add assertions here to verify the behavior when required data is missing
    }

    @Test
    public void testRecordFeedbackWithNullReview() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setOrderId(123456);
        feedback.setRestaurantId(789012);
        feedback.setDeliveryRating(5);
        // Set customer review as null
        feedback.setCustomerReview(null);

        feedback.recordFeedback();

        // Add assertions here to verify the behavior when the review is null
    }

    @Test
    public void testRecordFeedbackWithLowRating() {
        DeliveryFeedback feedback = new DeliveryFeedback();
        feedback.setOrderId(123456);
        feedback.setRestaurantId(789012);
        // Set a low delivery rating
        feedback.setDeliveryRating(2);
        feedback.setCustomerReview("Slow delivery");

        feedback.recordFeedback();


    }
}
// End of file
