Food Delivery System Testing Readme

Instructions to run this project.

# Step 1. Clone this project from GitHub

git clone https://github.com/Razib91lightspeed/tamk-5G00DM62-3004.git

# Step 2. Navigate to project directory

cd project

# Step 3. Run below command if jar files are missing

javac -cp .junit-4.12.jar;hamcrest-core-1.3.jar *.java

Step 4. To run Main.java, use below command

javac Main.java
java Main

Step 5. Once compiled, use below command to see all test result

javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" TestSuiteAll.java
java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestSuiteAll







## Project Overview

This repository contains the code for a food delivery system.
The system consists of various classes representing different entities such as
customers, delivery addresses, menus, orders, payments, restaurants,
and delivery persons. Additionally, there are test classes to ensure the correctness of the implemented functionalities.

## Project Structure
The project directory contains the following files and directories:

- `Customer.java`: Represents a customer entity.
- `DeliveryAddress.java`: Represents a delivery address entity.
- `DeliveryFeedback.java`: Represents feedback for a delivery.
- `DeliveryPerson.java`: Represents a delivery person entity.
- `DeliveryStatus.java`: Represents the status of a delivery.
- `Location.java`: Represents a location with latitude and longitude coordinates.
- `Menu.java`: Represents a menu offered by a restaurant.
- `MenuItem.java`: Represents an item on a menu.
- `Order.java`: Represents an order placed by a customer.
- `Payment.java`: Represents a payment made for an order.
- `Restaurant.java`: Represents a restaurant entity.
- `Main.java`: Main class to run the food delivery system.
- `TestSuiteAll.java`: Test suite to run all unit tests.
- `CustomTestListener.java`: Custom JUnit test listener to log test results.
- `TestRunner.java`: Main class to run individual unit tests.
- Test classes for each entity to ensure correctness:
  - `CustomerTest.java`
  - `DeliveryAddressTest.java`
  - `DeliveryFeedbackTest.java`
  - `DeliveryPersonTest.java`
  - `DeliveryStatusTest.java`
  - `LocationTest.java`
  - `MenuTest.java`
  - `MenuItemTest.java`
  - `OrderTest.java`
  - `PaymentTest.java`
  - `RestaurantTest.java`
- Libraries:
  - `junit-4.13.2.jar`: JUnit library for unit testing.
  - `hamcrest-core-1.3.jar`: Hamcrest library for writing matcher objects.



## 1 All files
(base) MacBook-Pro:razibtesting razibhasan$ ls
CustomTestListener.class	Menu.class
CustomTestListener.java		Menu.java
Customer.class			MenuItem.class
Customer.java			MenuItem.java
CustomerTest.class		MenuItemTest.class
CustomerTest.java		MenuItemTest.java
DeliveryAddress.class		MenuTest.class
DeliveryAddress.java		MenuTest.java
DeliveryAddressTest.class	OUTPUT.txt
DeliveryAddressTest.java	Order.class
DeliveryFeedback.class		Order.java
DeliveryFeedback.java		OrderTest.class
DeliveryFeedbackTest.class	OrderTest.java
DeliveryFeedbackTest.java	Payment.class
DeliveryPerson.class		Payment.java
DeliveryPerson.java		PaymentTest.class
DeliveryPersonTest.class	PaymentTest.java
DeliveryPersonTest.java		README.txt
DeliveryStatus.class		Restaurant.class
DeliveryStatus.java		Restaurant.java
DeliveryStatusTest.class	RestaurantTest.class
DeliveryStatusTest.java		RestaurantTest.java
ExceptionTestCounter.class	TestRunner.java
GRADE.txt			TestSuiteAll.class
Location.class			TestSuiteAll.java
Location.java			hamcrest-core-1.3.jar
LocationTest.class		junit-4.13.2.jar
LocationTest.java		takari-cpsuite-1.2.7.jar
Main.java
(base) MacBook-Pro:razibtesting razibhasan$



## 2 Start the entire food delivery system

(base) MacBook-Pro:razibtesting razibhasan$ javac Main.java
(base) MacBook-Pro:razibtesting razibhasan$ java Main
Customer Information:
Customer ID: 123456, Name: John Doe, Address: 123 Main St, City, Country

Delivery Address Information:
Name: Jane Smith
Customer ID: 789012
Address: 456 Oak St, City, Country
Delivery Instructions: Ring the doorbell twice.

Delivery Feedback Information:
Order ID: 123456
Restaurant ID: 789012
Delivery Rating: 5
Customer Review: Excellent service!

Delivery Person Information:
Delivery Person Information:
ID: 123
Order ID: 789
Status: On route
Location: null

Delivery Status Information:
Order ID: 123456
Delivery Status: 2
Delivery Person ID: 789

Location Information:
(40.7128, -74.006)

Menu Information:
Name: Special Menu
Description: Delicious dishes for special occasions
Price: 39.99
Portion Size: Large
Menu Items:
Name: Pizza, Description: Delicious pizza with various toppings, Price: 12.99, Portion Size: Medium
Name: Burger, Description: Classic burger with fries, Price: 8.99, Portion Size: Regular


Order Information:
Order ID: 123456
Customer ID: 789012
Delivery Address: null
Order Type: Delivery
Order Items:
MenuItem{name='Pizza', description='Delicious pizza with various toppings', price=12.99, portionSize='Medium'}
MenuItem{name='Pizza', description='Delicious pizza with various toppings', price=12.99, portionSize='Medium'}
MenuItem{name='Burger', description='Classic burger with fries', price=8.99, portionSize='Regular'}


Payment Information:
Payment Method: Credit Card
Amount: 50.0
Status: Completed

Restaurant Information:
Name: Tasty Burger
ID: 12345
Address: 789 Elm St, City, Country
Has Delivery Service: true
(base) MacBook-Pro:razibtesting razibhasan$




## 3 Test Suite Results

(base) MacBook-Pro:razibtesting razibhasan$ javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" TestSuiteAll.java
(base) MacBook-Pro:razibtesting razibhasan$ java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestSuiteAll
JUnit version 4.13.2
............................................................................................................................................................................................................................
Time: 0.088

OK (220 tests)

(base) MacBook-Pro:razibtesting razibhasan$




# 4 Testing logs

(base) MacBook-Pro:razibtesting razibhasan$ javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" TestSuiteAll.java
(base) MacBook-Pro:razibtesting razibhasan$ java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" TestSuiteAll
Starting test: testSetCustomerIdZero
Finished test: testSetCustomerIdZero
Starting test: testSetLastNameNull
Finished test: testSetLastNameNull
Starting test: testSetAddressEmpty
Finished test: testSetAddressEmpty




#5 Output File Generation
(base) MacBook-Pro:razibtesting razibhasan$ java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" TestSuiteAll > OUTPUT.txt
(base) MacBook-Pro:razibtesting razibhasan$
// End of file


