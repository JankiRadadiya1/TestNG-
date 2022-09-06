package Run_Testcase_Parallel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
//TestNg .xml parallel part2 (parallel-->with class) 
public class TestNg_Parallel_Part2 {
	
	WebDriver driver;
@Test(threadPoolSize=3, invocationCount = 3)    //to make run it 3 times give ThreadPoolSize and invocationCount  write both is complusary 
public void TestCase1() {
	System.out.println("This output is for TC1 : " + Thread.currentThread().getId());
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://rediff.com");
}
@Test
public void TestCase2() {
	System.out.println("This output is of TC2 : " +Thread.currentThread().getId());
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://makemytrip.com");
}
//situation method are 3 and thread count is 2 in testng xml
@Test
public void TestCase3() {
	System.out.println("This output is of TC3 : " +Thread.currentThread().getId());
	
	
}}
