package RetryLogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    // Counter to keep track of retry attempts
    int counterForRetryAttempts = 0;

    // Set max limit for retry
    int setMaxLimitForRetry = 3;

    @Override
    public boolean retry(ITestResult result) {

        if (!result.isSuccess()) {

            if (counterForRetryAttempts < setMaxLimitForRetry) {

                counterForRetryAttempts++;

                return true;
            }
        }

        return false;
    }
}