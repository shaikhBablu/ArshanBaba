package Govsite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class govclass {
            
	            WebDriver driver;
         @BeforeTest
         void setUp ()  {
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ideal\\Downloads\\chromedriver_win32\\chromedriver.exe");
     	    driver = new ChromeDriver();
         }
	
	     @BeforeClass
	     void launchURL () {
	    	 driver.get("https://www.godigit.com/traffic-rules/how-to-renew-driving-licence-in-maharashtra");
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	 
	     }	 
	     @Test (priority = 1)
	     void textcheck () {
	    	 WebElement headline = driver.findElement(By.xpath("//h1[text()='How to Renew Driving License in Maharashtra?']"));
	         System.out.println(headline.getText());
	     }
	     @Test (priority = 2)
	     void clickiing () {
	    	 WebElement clicks = driver.findElement(By.xpath("//span[@class='hamburger-inner']"));
	    	 clicks.click();
	     }
	     
	     @AfterClass
	     void closeBrowser () {
	    	 driver.quit();
	    	 
	     }
	     
	
	
	
	
}
	
	
	
	
	
