// Customer.java
/**
 * Represents a Customer in the food delivery system.
 */

class Customer {
    private String firstName; // The first name of the customer.
    private String lastName; // The last name of the customer.
    private int customerId; // The unique ID of the customer.
    private String address; // The address of the customer.

    /**
     * Sets the first name of the customer.
     * @param firstName The first name of the customer.
     */
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name of the customer.
     * @param lastName The last name of the customer.
     */
    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the unique ID of the customer.
     * @param customerId The ID of the customer.
     */
    void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * Sets the address of the customer.
     * @param address The address of the customer.
     */
    void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retrieves the first name of the customer.
     * @return The first name of the customer.
     */
    String getFirstName() {
        return firstName;
    }

    /**
     * Retrieves the last name of the customer.
     * @return The last name of the customer.
     */
    String getLastName() {
        return lastName;
    }

    /**
     * Retrieves the unique ID of the customer.
     * @return The unique ID of the customer.
     */
    int getCustomerId() {
        return customerId;
    }

    /**
     * Retrieves the address of the customer.
     * @return The address of the customer.
     */
    String getAddress() {
        return address;
    }

    /**
     * Places an order for the customer.
     * @param menu The menu from which the customer selects items.
     * @param quantity The quantity of the item to be ordered.
     * @return true if the order is successfully placed, false otherwise.
     */
    boolean placeOrder(Menu menu, int quantity) {
        // Check if the menu is not empty and quantity is greater than zero
        if (menu != null && menu.getMenuItems().length > 0 && quantity > 0) {
          
            return true; // Placeholder return statement
        } else {
            return false; // Order cannot be placed if menu is empty or quantity is zero or negative
        }
    }

    /**
     * Formats the customer information into a string.
     * @return The formatted string representing the customer information.
     */
    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + firstName + " " + lastName + ", Address: " + address;
    }
}
// End of file
