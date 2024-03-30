// javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" TestSuiteAll.java
// java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestSuiteAll


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runner.JUnitCore;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    CustomerTest.class,
    DeliveryAddressTest.class,
    DeliveryFeedbackTest.class,
    DeliveryPersonTest.class,
    DeliveryStatusTest.class,
    LocationTest.class,
    MenuTest.class,
    MenuItemTest.class,
    OrderTest.class,
    PaymentTest.class,
    RestaurantTest.class
})
public class TestSuiteAll {
    public static void main(String[] args) {
        // Run the test suite with the test listener
        JUnitCore core = new JUnitCore();
        core.addListener(new CustomTestListener()); // Add your custom test listener here
        core.run(TestSuiteAll.class);

        // Run the exception test counter
        ExceptionTestCounter.countExceptionTests();
    }
}

class ExceptionTestCounter {

    public static void countExceptionTests() {
        // Directory containing test files
        File directory = new File(".");

        // Counter for exception tests
        int exceptionTestCount = 0;

        if (directory.exists() && directory.isDirectory()) {
            // List of specific test files to be checked
            String[] specificTestFiles = {
                "CustomerTest.java",
                "DeliveryAddressTest.java",
                "DeliveryFeedbackTest.java",
                "DeliveryPersonTest.java",
                "DeliveryStatusTest.java",
                "LocationTest.java",
                "MenuTest.java",
                "MenuItemTest.java",
                "OrderTest.java",
                "PaymentTest.java",
                "RestaurantTest.java"
            };

            // Iterate through each specific test file
            for (String testFile : specificTestFiles) {
                File file = new File(testFile);
                if (file.exists() && file.isFile()) {
                    // If the test file exists and is a file
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            // Check if the line contains an expected exception annotation
                            if (line.contains("@Test(expected")) {
                                // If found, increment the exception test count
                                exceptionTestCount++;
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        System.out.println("Total number of exception tests: " + exceptionTestCount);
    }
}
// End of file
