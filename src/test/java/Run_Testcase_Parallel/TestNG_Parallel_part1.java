package Run_Testcase_Parallel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
//thread is class which help to determine the which runs when
//we set parallel thread count in xml file (we can manage if thread count is less or more than methods count we have to give as many method in class)
//parallel class and methods we can run all togather 1.conert into testng 2.select method or class give Thread count by your self and run .xml file
//select method in parallel part1 .xml (Parallel --> with Methods)
public class TestNG_Parallel_part1 {
	WebDriver driver;
@Test(threadPoolSize=3, invocationCount = 3)    //to make run it 3 times give ThreadPoolSize and invocationCount  write both complusary 
public void TestCase1() {
	System.out.println("This output is for TC1 : " + Thread.currentThread().getId());
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://google.com");
}
@Test
public void TestCase2() {
	System.out.println("This output is of TC2 : " +Thread.currentThread().getId());
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://flipcart.com");
}
//situation method are 3 and thread count is 2 in testng xml
@Test
public void TestCase3() {
	System.out.println("This output is of TC3 : " +Thread.currentThread().getId());
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://facebook.com");

}}
