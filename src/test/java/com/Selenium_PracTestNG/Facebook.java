package com.Selenium_PracTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
 public static WebDriver driver;
 public static Select select;
 
	  public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
       driver.manage().window().maximize(); 
       driver.get("https://www.facebook.com");
      driver.findElement(By.xpath("//div[@id= 'reg_pages_msg']/preceding::a[1]")).click();
      Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("janki");
       driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("makani");
       driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("jankiradadiya23@gmail.com");
       driver.findElement(By.id("password_step_input")).sendKeys("Janki@1410");  
//dropdown
       select=new Select(driver.findElement(By.id("month")));   
       select.selectByVisibleText("Jan");
       select=new Select(driver.findElement(By.id("day")));
       select.selectByVisibleText("10");
       select=new Select(driver.findElement(By.id("year")));
       select.selectByVisibleText("2000");
//Radiobutton:->
       driver.findElement(By.xpath("//label[contains(text(), 'Female')]")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[@name ='websubmit']")).click();
       driver.close();
       
}


	}


