package annotations_testng.code;
import org.testng.annotations.*;

public class Combination_BeforeMethod_AfterMethod {
      //this combination can run beforemethod ->1-test->Aftermethod /beforemethod->2test->Aftermethod
	// @BeforeMethod + @Test + @AfterMethod   --->this combination repeates for each test cases

		@BeforeMethod
		public void OpenLaptop() {
			System.out.println("Before Method");
		}
		@Test
		public void LaunchBrowser() {
			System.out.println("This test case is for browser Launch");
		}
		@Test
		public void LoginTest() {
			System.out.println("This Testcase is for Login Testcase");
		}
		@Test
		public void HomePageValidationTest() {
			System.out.println("This is Home page validation Test ");
		}
		@AfterMethod
		public void Logout() {
			System.out.println("After Method");
		}
	
	
}
