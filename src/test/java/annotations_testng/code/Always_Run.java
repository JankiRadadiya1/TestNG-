package annotations_testng.code;
import org.testng.Assert;
import org.testng.annotations.Test;
//only use when it dependend and test case fail
//lets say you have a test case and it failed there is another testcase which is dependent on the test case that failed, So if the first test case failed and the 2nd one is dependent
//on the first ont then obviosly it will fail.  -->but if you want to run you use// alwaysRun = true
//NOTE->alwaysRun = true cannot overirde the execution of enabled =false
public class Always_Run {

@Test
public void Login() {
	System.out.println("this is Login TestCase");
	Assert.fail("failing by myself to check this test case");     //failing this test case login()
}
@Test(dependsOnMethods="Login",alwaysRun=true)   //Login depends Logout -->so now this will also get Skipped but if you want to Run ->alwaysRun=true
public void Logout() {                                                      //it will execute the test case even if it is dependent on a failed Test Case    
	System.out.println("This is Logout TestCase");
}


	}


