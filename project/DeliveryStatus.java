// DeliveryStatus.java

/**
 * Represents the delivery status of an order in the food delivery system.
 */
class DeliveryStatus {
    private int orderId; // the ID of the order
    private int status; // the delivery status of the order
    private int deliveryPersonId; // the ID of the delivery person assigned to the order

    // Constants for delivery statuses
    public static final int DELIVERED = 1;
    public static final int IN_PROGRESS = 2;
    public static final int FAILED = 3;

    // Constructor
    public DeliveryStatus(int orderId, int status, int deliveryPersonId) {
        this.orderId = orderId;
        this.status = status;
        this.deliveryPersonId = deliveryPersonId;
    }

    /**
     * Sets the ID of the order.
     * @param orderId The ID of the order.
     */
    void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /**
     * Sets the delivery status of the order.
     * @param status The delivery status of the order.
     */
    void setStatus(int status) {
        this.status = status;
    }

    /**
     * Sets the ID of the delivery person assigned to the order.
     * @param deliveryPersonId The ID of the delivery person.
     */
    void setDeliveryPersonId(int deliveryPersonId) {
        this.deliveryPersonId = deliveryPersonId;
    }

    /**
     * Gets the ID of the order.
     * @return The ID of the order.
     */
    int getOrderId() {
        return orderId;
    }

    /**
     * Gets the delivery status of the order.
     * @return The delivery status of the order.
     */
    int getStatus() {
        return status;
    }

    /**
     * Gets the ID of the delivery person assigned to the order.
     * @return The ID of the delivery person.
     */
    int getDeliveryPersonId() {
        return deliveryPersonId;
    }

    /**
     * Updates the delivery status of the order.
     * @param status The new delivery status of the order.
     */
    void updateStatus(int status) {
        this.status = status;
    }

    /**
     * Formats the delivery status information into a string.
     * @return The formatted string representing the delivery status information.
     */
    @Override
    public String toString() {
        return "Order ID: " + orderId +
               "\nDelivery Status: " + status +
               "\nDelivery Person ID: " + deliveryPersonId;
    }
}
// End of file
