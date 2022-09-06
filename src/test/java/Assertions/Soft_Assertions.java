package Assertions;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
/*Softassertions->
STEP1) you will have to create the object of the SoftAssert class.
Step2->you need to invoke the method assertAll()
 Soft Assertions:->
A soft assertion continues with test execution even if the assertion condition fails.
Soft Assertion does not throw any error when the assertion condition fails but continues with the next step of the test case.*/
public class Soft_Assertions {

@Test
public void SoftTestCaseValidation() {
	SoftAssert softassert = new SoftAssert();
	System.out.println("I am writing a test Script");
	softassert.assertTrue(true);  //you are asserting or applying a validation condition that it is true
	
	System.out.println("I am writing a Java Logic");
	softassert.assertTrue(false); //you are asserting or applying a validation condition that it is False//before not failing but after give softassert.assert it failed 
	
	softassert.assertAll();        //this will identify all the exceptions inside the test case //Q-why the introdution of assertAll() method is giving the right result?
}   //Ans->Softassert will mention all the exceptions within the same test case if at the end of all the logic we invoke the method assertAll()

//if one softassert is failling/false but other logic still get executed
//if one if failing and one is pass we will get pass test case
//but if you give softassert.assertAll() it will show error of failing testcase
	
	
	
	
	
}
