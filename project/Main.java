// Main.java
/**
 * food delivery system.
 */

 public class Main {
    public static void main(String[] args) {

        // Create a Customer object
        Customer customer = new Customer();

        // Set the properties of the Customer object
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setCustomerId(123456);
        customer.setAddress("123 Main St, City, Country");

        // Optionally, print the customer information
        System.out.println("Customer Information:");
        System.out.println(customer.toString());

        // Create a DeliveryAddress object
        DeliveryAddress deliveryAddress = new DeliveryAddress("123 Main St", "City", "12345");

        // Set the properties of the DeliveryAddress object
        deliveryAddress.setFirstName("Jane");
        deliveryAddress.setLastName("Smith");
        deliveryAddress.setCustomerId(789012);
        deliveryAddress.setAddress("456 Oak St, City, Country");
        deliveryAddress.setDeliveryInstructions("Ring the doorbell twice.");

        // Optionally, print the delivery address information
        System.out.println("\nDelivery Address Information:");
        System.out.println(deliveryAddress.toString());

        // Create a DeliveryFeedback object
        DeliveryFeedback deliveryFeedback = new DeliveryFeedback();

        // Set the properties of the DeliveryFeedback object
        deliveryFeedback.setOrderId(123456);
        deliveryFeedback.setRestaurantId(789012);
        deliveryFeedback.setDeliveryRating(5); // Assuming a rating of 5
        deliveryFeedback.setCustomerReview("Excellent service!");

        // Optionally, print the delivery feedback information
        System.out.println("\nDelivery Feedback Information:");
        System.out.println(deliveryFeedback.toString());

        // Create a DeliveryPerson object
        DeliveryPerson deliveryPerson = new DeliveryPerson();

        // Set the properties of the DeliveryPerson object
        deliveryPerson.setId(123);
        deliveryPerson.setOrderId(789);
        deliveryPerson.setStatus("On route");
        Location location1 = new Location(40.7128, -74.0060); // Pass valid latitude and longitude as doubles

        // Optionally, print the delivery person information
        System.out.println("\nDelivery Person Information:");
        System.out.println(deliveryPerson.toString());

        // Create a DeliveryStatus object
        // Example values, replace with actual values
        DeliveryStatus deliveryStatus = new DeliveryStatus(123456, DeliveryStatus.IN_PROGRESS, 789);

        // Optionally, print the delivery status information
        System.out.println("\nDelivery Status Information:");
        System.out.println(deliveryStatus.toString());

        // Create a Location object
        Location location2 = new Location(40.7128, -74.0060); // Pass valid latitude and longitude as doubles

        // Optionally, print the location information
        System.out.println("\nLocation Information:");
        System.out.println(location2.toString());

        // Create a Menu object
        Menu menu = new Menu();

        // Set the properties of the Menu object
        menu.setName("Special Menu");
        menu.setDescription("Delicious dishes for special occasions");
        menu.setPrice(39.99);
        menu.setPortionSize("Large");

        // Add menu items
        MenuItem item1 = new MenuItem("Pizza", "Delicious pizza with various toppings", 12.99, "Medium");
        MenuItem item2 = new MenuItem("Burger", "Classic burger with fries", 8.99, "Regular");

        // Add menu items to the menu
        menu.setMenuItems(new MenuItem[]{item1, item2});

        // Print the menu information
        System.out.println("\nMenu Information:");
        System.out.println(menu.toString());

        // Create an Order object
        Order order = new Order();

        // Set the properties of the Order object
        order.setOrderId(123456);
        order.setCustomerId(789012);

        // Create a DeliveryAddress object using constructor with parameters
        DeliveryAddress address = new DeliveryAddress("123 Main St", "City", "12345");

        // Set the order type
        order.setOrderType("Delivery");

        // Add menu items to the order
        order.addMenuItem(item1, 2); // Add 2 pizzas
        order.addMenuItem(item2, 1); // Add 1 burger

        // Print the order information
        System.out.println("\nOrder Information:");
        System.out.println(order.toString());

        // Create a Payment object
        Payment payment = new Payment();

        // Set the properties of the Payment object
        payment.setPaymentMethod("Credit Card");
        payment.setAmount(50.0);
        payment.setStatus("Completed");

        // Print the payment information
        System.out.println("\nPayment Information:");
        System.out.println(payment.toString());

        // Create a Restaurant object
        Restaurant restaurant = new Restaurant();

        // Set the properties of the Restaurant object
        restaurant.setName("Tasty Burger");
        restaurant.setId(12345);
        restaurant.setAddress("789 Elm St, City, Country");
        restaurant.setMenu(menu);
        restaurant.setDeliveryService(true);

        // Print the restaurant information
        System.out.println("\nRestaurant Information:");
        System.out.println(restaurant.toString());
    }
}
// End of file
