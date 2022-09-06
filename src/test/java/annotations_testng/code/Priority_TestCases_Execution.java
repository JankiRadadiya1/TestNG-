package annotations_testng.code;
import org.testng.annotations.*;
//INTERVIEWQ->1)What if I want a particular test Case to run first?
//Ans->make it priority=1 make sure other testcase also get priority, else Testng will follow alphabetical sequence
//2)What if we not want to run particluar test case how you can do that? or how to disable a test case?
//Ans->enabled=false (NOTE:->what if we make disbable= true (it not works) disable is not a word works)
//NOTE->enabled=true is to do nothing is same as @Test(we can write or not nothing matter to testcase) 
//if you want to run any test case at 1st you have to prioritize all test cases otherwise it will run as per alphabetical order 
public class Priority_TestCases_Execution {
	
@Test(priority=4)
public void Apple() {
	System.out.println("This TestCase has Alphabet A");
}
@Test (priority=1)        //it will not excute 1st if you only we give priority=1 to only one testcase but priotize all than only it will run as per priority.otherwise alphabetical order.
public void Ballon() {
	System.out.println("This TestCase has Alphabet B");
}
@Test(priority=3,enabled=true)         //it does not matter if we write enabled=true or not it run same
public void Coding() {
	System.out.println("This TestCase has Alphabet C");
}
@Test (priority=2,enabled=false)       //enabled = false if you not want to run this test case 
public void Zebra() {
	System.out.println("This TestCase has Alphabet Z");
		
    }
	
}
