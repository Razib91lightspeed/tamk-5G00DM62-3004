// DeliveryFeedback.java

/**
 * Represents the feedback for a delivery in the food delivery system.
 */
class DeliveryFeedback {
    private int orderId; // The ID of the order.
    private int restaurantId; // The ID of the restaurant.
    private int deliveryRating; // The rating of the delivery service.
    private String customerReview; // The review given by the customer.

    // Getter methods
    int getOrderId() {
        return orderId;
    }

    int getRestaurantId() {
        return restaurantId;
    }

    int getDeliveryRating() {
        return deliveryRating;
    }

    String getCustomerReview() {
        return customerReview;
    }

    /**
     * Sets the ID of the order.
     * @param orderId The ID of the order.
     */
    void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /**
     * Sets the ID of the restaurant.
     * @param restaurantId The ID of the restaurant.
     */
    void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     * Sets the rating of the delivery service.
     * @param rating The rating of the delivery service.
     */
    void setDeliveryRating(int rating) {
        this.deliveryRating = rating;
    }

    /**
     * Sets the review given by the customer.
     * @param review The review given by the customer.
     */
    void setCustomerReview(String review) {
        this.customerReview = review;
    }

    /**
     * Records the delivery feedback.
     */
    void recordFeedback() {
        // Logic to record feedback goes here...
    }

    /**
     * Formats the delivery feedback into a string.
     * @return The formatted string representing the delivery feedback.
     */
    @Override
    public String toString() {
        return "Order ID: " + orderId +
               "\nRestaurant ID: " + restaurantId +
               "\nDelivery Rating: " + deliveryRating +
               "\nCustomer Review: " + customerReview;
    }
}
// End of file
