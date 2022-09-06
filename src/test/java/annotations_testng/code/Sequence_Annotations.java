package annotations_testng.code;
//precedence Wise Execution :->
//Interview Q->What are diff annotations that you know =? how many did you use? what is preedence
////BeforeSuite >@ BeforeTest >@ BeforeClass > @BeforeMethod >@ Test >@ AfterMethod >@ AfterClass > @AfterTest > @AfterSuite
import org.testng.annotations.*;

public class Sequence_Annotations{
	
	@BeforeSuite
	 public void beforeSuite() {
	   System.out.println("This will execute before the Test Suite");
	 }
	 @BeforeTest
	 public void beforeTest() {
	   System.out.println("This will execute before the Test");
	 }
	@BeforeClass
	 public void beforeClass() {
	   System.out.println("This will execute before the Class");
	 }	
	 @BeforeMethod
	 public void beforeMethod() {
	   System.out.println("This will execute before every Method");
	 }
	 
	 @Test
	 public void testCase1() {
	   System.out.println("This is the A Normal Test Case"); 
	 }

	 @AfterMethod
	 public void afterMethod() {
	   System.out.println("This will execute after every Method");
	 }
	 
	 @AfterClass
	 public void afterClass() {
	   System.out.println("This will execute after the Class");
	 }
		 
	 @AfterTest
	 public void afterTest() {
	   System.out.println("This will execute after the Test");
	 }
	 	 
	 @AfterSuite
	 public void afterSuite() {
	   System.out.println("This will execute after the Test Suite");
	 }
	}
	


