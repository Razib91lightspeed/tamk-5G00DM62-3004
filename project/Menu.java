// Menu.java
/**
 * Represents a menu in a restaurant.
 */
public class Menu {
    private String name; // The name of the menu.
    private String description; // The description of the menu.
    private double price; // The price of the menu.
    private String portionSize; // The portion size of the menu.
    private MenuItem[] menuItems; // Array of menu items.

    /**
     * Constructor to initialize a Menu object.
     */
    public Menu() {
        // Initialize menuItems array with an empty array
        this.menuItems = new MenuItem[0];
    }

    /**
     * Sets the name of the menu.
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the menu.
     * @return The name of the menu.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the description of the menu.
     * @param description The description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the description of the menu.
     * @return The description of the menu.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the price of the menu.
     * @param price The price to set.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the price of the menu.
     * @return The price of the menu.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the portion size of the menu.
     * @param portionSize The portion size to set.
     */
    public void setPortionSize(String portionSize) {
        this.portionSize = portionSize;
    }

    /**
     * Gets the portion size of the menu.
     * @return The portion size of the menu.
     */
    public String getPortionSize() {
        return portionSize;
    }

    /**
     * Sets the menu items for the menu.
     * @param menuItems The array of MenuItem objects to set.
     */
    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    /**
     * Gets the menu items for the menu.
     * @return The array of MenuItem objects.
     */
    public MenuItem[] getMenuItems() {
        if (menuItems == null) {
            return new MenuItem[0];
        }
        return menuItems;
    }


    /**
     * Formats the menu information into a string.
     * @return The formatted string representing the menu information.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Name: ").append(name).append("\n");
        sb.append("Description: ").append(description).append("\n");
        sb.append("Price: ").append(price).append("\n");
        sb.append("Portion Size: ").append(portionSize).append("\n");
        sb.append("Menu Items:\n");
        for (MenuItem item : menuItems) {
            sb.append("Name: ").append(item.getName()).append(", Description: ").append(item.getDescription())
                    .append(", Price: ").append(item.getPrice()).append(", Portion Size: ").append(item.getPortionSize())
                    .append("\n");
        }
        return sb.toString();
    }
}
// End of file
