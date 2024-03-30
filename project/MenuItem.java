// MenuItem.java
/**
 * Represents a menu item in the food delivery system.
 */
public class MenuItem {
    private String name; // the name of the menu item
    private String description; // the description of the menu item
    private double price; // the price of the menu item
    private String portionSize; // the portion size of the menu item

    // Constructor with arguments
    public MenuItem(String name, String description, double price, String portionSize) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.portionSize = portionSize;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPortionSize() {
        return portionSize;
    }

    public void setPortionSize(String portionSize) {
        this.portionSize = portionSize;
    }

    // toString method to represent MenuItem as a string
    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", portionSize='" + portionSize + '\'' +
                '}';
    }
}
// End of file
