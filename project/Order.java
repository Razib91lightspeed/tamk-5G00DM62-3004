// Order.java
/**
 * Represents a Order in the food delivery system.
 */

 class Order {
    private int orderId; // the ID of the order
    private int customerId; // the ID of the customer placing the order
    private DeliveryAddress deliveryAddress; // the delivery address for the order
    private String orderType; // the type of the order (dine-in or delivery)
    private MenuItem[] orderItems; // array of items in the order
    private int itemCount; // counter for the number of items in the order

    // Constructs an Order object with the given parameters.
    public Order() {
        orderItems = new MenuItem[10]; // Initial capacity of 10 items
        itemCount = 0;
    }

        /**
     * Gets the ID of the order.
     * @return The ID of the order.
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Gets the ID of the customer placing the order.
     * @return The ID of the customer.
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Gets the delivery address for the order.
     * @return The delivery address.
     */
    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Gets the number of items in the order.
     * @return The number of items in the order.
     */
    public int getItemCount() {
        return itemCount;
    }

    /**
     * Gets the type of the order.
     * @return The type of the order.
     */
    public String getOrderType() {
        return orderType;
    }


    // Sets the ID of the order.
    // @param orderId the ID of the order to set
    // @throws IllegalArgumentException if orderId is less than or equal to zero
    void setOrderId(int orderId) {
        if (orderId <= 0) {
            throw new IllegalArgumentException("Order ID must be greater than zero");
        }
        this.orderId = orderId;
    }

    // Sets the ID of the customer placing the order.
    // @param customerId the ID of the customer to set
    // @throws IllegalArgumentException if customerId is less than or equal to zero
    void setCustomerId(int customerId) {
        if (customerId <= 0) {
            throw new IllegalArgumentException("Customer ID must be greater than zero");
        }
        this.customerId = customerId;
    }



    // Sets the delivery address for the order.
    // @param deliveryAddress the delivery address to set
    // @throws NullPointerException if deliveryAddress is null
    void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        if (deliveryAddress == null) {
            throw new NullPointerException("Delivery address cannot be null");
        }
        this.deliveryAddress = deliveryAddress;
    }


    // Adds a menu item to the order.
    // @param item the menu item to add
    // @param quantity the quantity of the menu item to add
    // @throws IllegalArgumentException if item is null or quantity is less than or equal to zero
    void addMenuItem(MenuItem item, int quantity) {
        if (item == null) {
            throw new IllegalArgumentException("Menu item cannot be null");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        for (int i = 0; i < quantity; i++) {
            if (itemCount == orderItems.length) {
                // If the array is full, resize it
                MenuItem[] newArray = new MenuItem[orderItems.length * 2];
                System.arraycopy(orderItems, 0, newArray, 0, orderItems.length);
                orderItems = newArray;
            }
            orderItems[itemCount++] = item;
        }
    }

    // Sets the type of the order.
    // @param orderType the type of the order to set
    void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    // Formats the order information into a string.
    // @return the formatted string representing the order information
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId).append("\n");
        sb.append("Customer ID: ").append(customerId).append("\n");
        sb.append("Delivery Address: ").append(deliveryAddress).append("\n");
        sb.append("Order Type: ").append(orderType).append("\n");
        sb.append("Order Items:\n");
        if (itemCount > 0) {
            for (int i = 0; i < itemCount; i++) {
                sb.append(orderItems[i]).append("\n");
            }
        } else {
            sb.append("No items in the order\n");
        }
        return sb.toString();
    }
}
// End of file
