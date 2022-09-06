package Groups_TestNG;
import org.testng.annotations.Test;
@Test(groups = "CompleteClassLevelTest")                   //Class Level groups
public class Group_Concept {
	
	@Test(groups= {"smoke"})                                    //Groups- include and exclude
	public void TC1() {
		System.out.println("This is TC1 Logic");
	}
	@Test(groups= {"smoke","sanity"} )
	public void TC2() {
		System.out.println("This is TC2 Logic");
	}
	@Test(groups= {"smoke","snaity","regression"})  
	public void TC3() {
		System.out.println("This is TC3 Logic");
	}
	@Test(groups= {"windows.sanity"})                                    //regular expersion -inculde test case for windows or linux
	public void TC4() {
		System.out.println("This is TC4 Logic");
	}	
	@Test(groups= {"linux.regression"})
	public void TC5() {
		System.out.println("This is TC5 Logic");
		
	}
}
