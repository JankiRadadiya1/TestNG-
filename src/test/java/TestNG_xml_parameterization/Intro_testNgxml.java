package TestNG_xml_parameterization;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Intro_testNgxml {
	public static WebDriver driver;
	public static Select select;
	
@Test
@Parameters({"Browser","url","emailid","password"})
public void Setup(String Browser, String url, String emailid, String password)  {
	
if(Browser.equals("Chrome")) {
	     WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver();
}else if(Browser.equals("Mozilla")) {
		WebDriverManager.firefoxdriver().setup();
	    driver= new FirefoxDriver();
}
   driver.manage().window().maximize(); 
   driver.get(url);                                                                                                                      //giving parameter name as url
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.findElement(By.xpath("//div[@id= 'reg_pages_msg']/preceding::a[1]")).click();
   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("janki");
   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("makani");
   driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(emailid);   //giving only name of parameter emailid 
   driver.findElement(By.id("password_step_input")).sendKeys(password);                    //giving only name as parameter password
//dropdown
   select=new Select(driver.findElement(By.id("month")));   
   select.selectByVisibleText("Jan");
   select=new Select(driver.findElement(By.id("day")));
   select.selectByVisibleText("10");
   select=new Select(driver.findElement(By.id("year")));
   select.selectByVisibleText("2000");
//Radiobutton:->
   driver.findElement(By.xpath("//label[contains(text(), 'Female')]")).click();
   driver.findElement(By.xpath("//button[@name ='websubmit']")).click();
   driver.close();
	
}
	
}
