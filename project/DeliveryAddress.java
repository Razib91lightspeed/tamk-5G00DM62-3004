// DeliveryAddress.java
/**
 * Represents a delivery address in the food delivery system.
 */
class DeliveryAddress {
    private String firstName; // The first name of the customer.
    private String lastName; // The last name of the customer.
    private int customerId; // The ID of the customer.
    private String address; // The address of the customer.
    private String deliveryInstructions; // Instructions for delivery.

    // Variables for street, city, and postalCode
    private String street;
    private String city;
    private String postalCode;

    // Constructor with arguments
    public DeliveryAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    /**
     * Sets the first name of the customer.
     * @param firstName The first name of the customer.
     */
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the first name of the customer.
     * @return The first name of the customer.
     */
    String getFirstName() {
        return firstName;
    }

    /**
     * Sets the last name of the customer.
     * @param lastName The last name of the customer.
     */
    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the last name of the customer.
     * @return The last name of the customer.
     */
    String getLastName() {
        return lastName;
    }

    /**
     * Sets the ID of the customer.
     * @param customerId The ID of the customer.
     */
    void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * Gets the ID of the customer.
     * @return The ID of the customer.
     */
    int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the address of the customer.
     * @param address The address of the customer.
     */
    void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the address of the customer.
     * @return The address of the customer.
     */
    String getAddress() {
        return address;
    }

    /**
     * Sets the delivery instructions.
     * @param instructions The delivery instructions.
     */
    void setDeliveryInstructions(String instructions) {
        this.deliveryInstructions = instructions;
    }

    /**
     * Gets the delivery instructions.
     * @return The delivery instructions.
     */
    String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    /**
     * Formats the delivery address information into a string.
     * @return The formatted string representing the delivery address information.
     */
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
               "\nCustomer ID: " + customerId +
               "\nAddress: " + address +
               "\nDelivery Instructions: " + deliveryInstructions;
    }
}
// End of file
