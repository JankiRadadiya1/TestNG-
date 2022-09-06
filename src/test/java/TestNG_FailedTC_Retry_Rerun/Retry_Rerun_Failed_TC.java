package TestNG_FailedTC_Retry_Rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Rerun_Failed_TC implements IRetryAnalyzer{
	
	
	 private int retryCount = 0;
	  private static final int maxRetryCount = 3;
	 
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	}

	


