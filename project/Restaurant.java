// Restaurant.java
/**
 * Represents a restaurant in the food delivery system.
 */
class Restaurant {
    private String name; // the name of the restaurant
    private int id; // the ID of the restaurant
    private String address; // the address of the restaurant
    private Menu menu; // the menu of the restaurant
    private boolean hasDeliveryService; // indicates whether the restaurant provides delivery service

    /**
     * Sets the name of the restaurant.
     * @param name the name of the restaurant
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the restaurant.
     * @return the name of the restaurant
     */
    String getName() {
        return name;
    }

    /**
     * Sets the ID of the restaurant.
     * @param id the ID of the restaurant
     */
    void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the ID of the restaurant.
     * @return the ID of the restaurant
     */
    int getId() {
        return id;
    }

    /**
     * Sets the address of the restaurant.
     * @param address the address of the restaurant
     */
    void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the address of the restaurant.
     * @return the address of the restaurant
     */
    String getAddress() {
        return address;
    }

    /**
     * Sets the menu of the restaurant.
     * @param menu the menu of the restaurant
     */
    void setMenu(Menu menu) {
        this.menu = menu;
    }

    /**
     * Gets the menu of the restaurant.
     * @return the menu of the restaurant
     */
    Menu getMenu() {
        return menu;
    }

    /**
     * Sets whether the restaurant provides delivery service.
     * @param hasDeliveryService true if the restaurant provides delivery service, false otherwise
     */
    void setDeliveryService(boolean hasDeliveryService) {
        this.hasDeliveryService = hasDeliveryService;
    }

    /**
     * Checks if the restaurant provides delivery service.
     * @return true if the restaurant provides delivery service, false otherwise
     */
    boolean hasDeliveryService() {
        return hasDeliveryService;
    }

    /**
     * Formats the restaurant information into a string.
     * @return a string containing the restaurant information
     */
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "ID: " + id + "\n" +
               "Address: " + address + "\n" +
               "Has Delivery Service: " + hasDeliveryService;
    }
}
// End of file
