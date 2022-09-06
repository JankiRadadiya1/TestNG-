package ITestContext_Interface;
import org.testng.ITestContext;
import org.testng.annotations.Test;
public class ITest_Context_Interface {
//ItestContext is an interface
//purpose->Within the same Java file or class file, it helps sharing data within the Test cases
	
@Test(priority=1)
public void setUp(ITestContext context) {      //passing the OBJref of the interface inside the method body(same in every method)
	System.out.println("This is setup of our new Laptop");
	context.setAttribute("Windows10", "Asus");
}
@Test(priority=2, dependsOnMethods= {"setUp"})
public void Login(ITestContext context) {
	System.out.println("This is the Logical Functioning of our new Laptop");
	 String OperatingSystem = (String)context.getAttribute("Windows10");
	 System.out.println("The setUp for the operating system for Asus Laptop is: "+OperatingSystem);
	 context.setAttribute("Complex", "Develops + Agile");
}
@Test(priority=3, dependsOnMethods= {"setUp","Login"})
public void exit(ITestContext context) {
	System.out.println("This is exit of our Laptop");
	String OperatingSystem=(String) context.getAttribute("Windows10");
	System.out.println("The setUp for the operating system for Asus Laptop is: "+OperatingSystem);
	String LogicComplexity = (String)context.getAttribute("Complex");
	System.out.println("The Logic Complexity even at the exit point is "+ LogicComplexity);
	
}
	
	
}
