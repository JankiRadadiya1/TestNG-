package com.Selenium_PracTestNG;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QA_demo_allelements {

	public static WebDriver driver;
	
 @Test
 public void Links(){
	  
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://demoqa.com/links");
	   
//1 ) Links:->total links -->name of links
	   List<WebElement> Links = driver.findElements(By.tagName("a"));
	  System.out.println("Total Links Present in webpage  " + Links.size());
	  
	 for(int i = 0; i<Links.size(); i++) {
		 System.out.println("Name of the links is  " + Links.get(i).getText());
		
	 }
	
 }
 //2)RadioButton:-> is displayed , is selected, select -->right one than select wrong msg should be display 
@Test
public void RadioButton(){
	  WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://demoqa.com/radio-button");
	   
    // List<WebElement> RadioButton = driver.findElements(By.xpath("//input[@type='radio']"));
    //       System.out.println("Total Radio buttons  "+ RadioButton.size());
             driver.findElement(By.id("yesRadio")).click();
     }
		

}
