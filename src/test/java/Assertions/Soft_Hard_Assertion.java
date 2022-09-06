package Assertions;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
//Hard Assert ->where the test case validation failed it not go furthre it willnot execute furthure testcase
//Softassertion is good  because when ever there is validation failed it still run furthure it not stop at failed test case validation -
//and for correct output( if you want exception of failed test case(assertall))
public class Soft_Hard_Assertion {
	
@Test
public void HardAssertionLogic() {
	System.out.println("This is my first Hard Assert statment");       //pass tc
	Assert.assertTrue(true);
	
	System.out.println("This is my Second Hard Assert statment");  //Fail tc  --->it will not go to thrid it will be faild here only ->HardAssert
	Assert.assertTrue(false);
	
	System.out.println("This is my Thrid Hard Assert Satament");     //pass tc
	Assert.assertTrue(true);
}

@Test
public void SoftAssertionLogic() {
	 SoftAssert softassert = new SoftAssert();              //1.create SoftAssert class object
	 
	 System.out.println("This is my first SoftAssertStament ");     //pass
	 softassert.assertTrue(true);
	 
	 System.out.println("This is my Second SoftAssertStament "); //fail ->but still it will go to thrid validation and execute furthure one
	 softassert.assertTrue(false);
	 
	 System.out.println("This is my Thrid SoftAssertStament "); //pass
	 softassert.assertTrue(true);
		
	 softassert.assertAll();     //(correct output)to catch exception of failed testcase in output otherwise it passed all the test case
}

}
