package Assertions;
import org.testng.Assert;
/*Hard Assertions
->A hard assertion does not continue with execution until the assertion condition is True.
->Hard assertions usually throw an Assertion Error whenever an assertion condition fails.
->The test case will be immediately marked as Failed when a hard assertion condition fails.*/
import org.testng.annotations.*;
//what are Assertions -> Validation check points like BVA or EVP
//IMP->Assertion is a Class 
//listed some methods of class Assert THIS IS HARD Assertion :->
//1)Assertions
//2)Assert.assertTrue          ->
//3)Assert.assertEquals      ->to compare actual and expected 
//4)Assert.fail                     ->to fail test case
public class Hard_Assertions {
	
	@Test
	public void ParameterA() {
		String actual ="My channel is about Automation";
	   String expected="My channel is about Manual";

//	   Assert.assertEquals(actual, expected);
//     Assert.assertTrue(true != false);   //is a false condition //now true 
	     Assert.fail();
	     Assert.fail("I am deliberately failling test case parameter A");
		}
	}
	
