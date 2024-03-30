// DeliveryPerson.java
/**
 * Represents a DeliveryPerson in the food delivery system.
 */

 class DeliveryPerson {
    private int id; // The ID of the delivery person.
    private int orderId; // The ID of the order being delivered.
    private String status; // The current work status of the delivery person.
    private Location location; // The current location of the delivery person.

    // Constructor (if needed)
    // void DeliveryPerson() { }

    /**
     * Sets the ID of the delivery person.
     *
     * @param id The ID of the delivery person.
     */
    void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the ID of the delivery person.
     *
     * @return The ID of the delivery person.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the order being delivered.
     *
     * @param orderId The ID of the order being delivered.
     */
    void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /**
     * Sets the work status of the delivery person.
     *
     * @param status The work status of the delivery person.
     */
    void setStatus(String status) {
        this.status = status;
    }

    /**
     * Updates the location of the delivery person.
     *
     * @param location The new location of the delivery person.
     */
    void updateLocation(Location location) {
        // Check if the location is null or if coordinates are invalid
        if (location == null || !isValidCoordinates(location.getLatitude(), location.getLongitude())) {
            this.location = null; // Set location to null if coordinates are invalid
        } else {
            this.location = location; // Update location if coordinates are valid
        }
    }


    // Helper method to validate coordinates
    private boolean isValidCoordinates(double latitude, double longitude) {
        // Check if latitude and longitude are within valid ranges
        return latitude >= -90 && latitude <= 90 && longitude >= -180 && longitude <= 180;
    }

    /**
     * Handles the delivery task.
     */
    void handleDelivery() {
        // Logic to handle delivery task goes here.
    }

    /**
     * Formats the delivery person information into a string.
     *
     * @return The formatted string representing the delivery person information.
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Delivery Person Information:\n");
        stringBuilder.append("ID: ").append(id).append("\n");
        stringBuilder.append("Order ID: ").append(orderId).append("\n");
        stringBuilder.append("Status: ");
        if (status != null && !status.isEmpty()) {
            stringBuilder.append(status);
        }
        stringBuilder.append("\n");
        stringBuilder.append("Location: ");
        if (location != null) {
            stringBuilder.append(location);
        } else {
            stringBuilder.append("null");
        }
        return stringBuilder.toString();
    }

    /**
     * Gets the ID of the order being delivered.
     *
     * @return The ID of the order being delivered.
     */
    int getOrderId() {
        return orderId;
    }

    /**
     * Gets the work status of the delivery person.
     *
     * @return The work status of the delivery person.
     */
    String getStatus() {
        return status;
    }

    /**
     * Gets the current location of the delivery person.
     *
     * @return The current location of the delivery person.
     */
    Location getLocation() {
        return location;
    }
}
// End of file
