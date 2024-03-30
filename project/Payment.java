// Payment.java
/**
 * Represents a payment in the food delivery system.
 */

class Payment {
    private String paymentMethod; // the payment method used
    private double amount; // the amount of the payment
    private String status; // the status of the payment (e.g., pending, completed)

    /**
 * Sets the payment method.
 * @param paymentMethod the payment method used
 * @throws IllegalArgumentException if paymentMethod is empty
 * @throws NullPointerException if paymentMethod is null
 */
void setPaymentMethod(String paymentMethod) {
    if (paymentMethod == null) {
        throw new NullPointerException("Payment method cannot be null");
    }
    if (paymentMethod.isEmpty()) {
        throw new IllegalArgumentException("Payment method cannot be empty");
    }
    this.paymentMethod = paymentMethod;
}


    /**
     * Gets the payment method.
     * @return the payment method used
     */
    String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the amount of the payment.
     * @param amount the amount of the payment
     * @throws IllegalArgumentException if amount is negative
     */
    void setAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.amount = amount;
    }

    /**
     * Gets the amount of the payment.
     * @return the amount of the payment
     */
    double getAmount() {
        return amount;
    }

    /**
     * Sets the status of the payment.
     * @param status the status of the payment
     */
    void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the status of the payment.
     * @return the status of the payment
     */
    String getStatus() {
        return status;
    }

    /**
     * Processes the payment for an order.
     * @param orderId the ID of the order for which the payment is being processed
     */
    void processPayment(int orderId) {
        // logic to process payment goes here
    }

    /**
     * Generates an invoice for an order.
     * @param orderId the ID of the order for which the invoice is being generated
     */
    void generateInvoice(int orderId) {
        // logic to generate invoice goes here
    }

    /**
     * Formats the payment information into a string.
     * @return a string containing the payment information
     */
    @Override
    public String toString() {
        return  "Payment Method: " + paymentMethod + "\n" +
               "Amount: " + amount + "\n" +
               "Status: " + status;
    }
}
// End of file
