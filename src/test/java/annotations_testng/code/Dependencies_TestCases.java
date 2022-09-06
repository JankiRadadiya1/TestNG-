package annotations_testng.code;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
//ed->one test case depend on other test case how to do that-> here GotoSiginin is depend upon the URLopen so how to define dependency
//sometime there are 50 test cases than this dependency make your code in good manner and understable manner for framework 
public class Dependencies_TestCases {
	public static WebDriver driver;
@Test
public void URLopen() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://automationpractice.com/index.php");
	}
@Test(dependsOnMethods = "URLopen")                                      //beacuse this method is depend on URLopen 
public void GotoSignin() {
	driver.findElement(By.xpath("//a[@class='login']")).click();
}

@Test (dependsOnMethods = {"URLopen","GotoSignin"})         //this method is depend on both of above methods                     
public void LoginPage() { 
	driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("Janviidlknd@gmail.com");
	driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
}




}
	
	
	
	
	
	
	
	
	
	
	
	


