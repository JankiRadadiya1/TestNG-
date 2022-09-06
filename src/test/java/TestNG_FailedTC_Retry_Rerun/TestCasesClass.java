package TestNG_FailedTC_Retry_Rerun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
//(retryAnalyzer = Retry_Rerun_Failed_TC.class) --> if you think there is issue in your test cases used to check the ouput failed and  it run multiple time test case 
public class TestCasesClass {
	
	@Test(retryAnalyzer = Retry_Rerun_Failed_TC.class)        //Retry_Rerun_Failed_TC this is my class name where code for run the code  
 public void TestClassRerun(){
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	driver.findElement(By.className("signinbtn")).click();
	Assert.fail("Trying to fail deliberately");     //fail to check
	
}
}