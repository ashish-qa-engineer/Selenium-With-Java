package RetryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesExample {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void TestCase01() {

        Assert.assertTrue(false); // Will fail and retry
    }

    @Test
    public void TestCase02() {

        Assert.assertTrue(false); // Will fail and retry
    }

    @Test
    public void TestCase03() {

        Assert.assertTrue(true); // Will pass
    }
}