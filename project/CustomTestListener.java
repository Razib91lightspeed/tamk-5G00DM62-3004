import org.junit.runner.notification.RunListener;
import org.junit.runner.Description;
import org.junit.runner.Result;

public class CustomTestListener extends RunListener {

    @Override
    public void testStarted(Description description) throws Exception {
        // Logic to execute before each test starts
        System.out.println("Starting test: " + description.getMethodName());
    }

    @Override
    public void testFinished(Description description) throws Exception {
        // Logic to execute after each test finishes
        System.out.println("Finished test: " + description.getMethodName());
    }

    @Override
    public void testRunFinished(Result result) throws Exception {
        // Logic to execute after all tests in the suite finish
        System.out.println("Total tests run: " + result.getRunCount());
    }
}

// End of file
