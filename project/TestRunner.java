import org.junit.runner.JUnitCore;

public class TestRunner {
    private JUnitCore core;

    public TestRunner(JUnitCore core) {
        this.core = core;
    }

    public void run() {
        // Run the test suite
        core.run(TestSuiteAll.class);
    }
}
// End of file
