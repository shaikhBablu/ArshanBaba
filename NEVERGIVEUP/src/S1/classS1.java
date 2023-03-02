package S1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classS1 {
           WebDriver driver;
	     
        @BeforeTest   
        void setUp ()   { 
           
	         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ideal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	         driver = new ChromeDriver();

        }
	
        @BeforeClass
        void launchURL ()  {
        	driver.get("https://in.puma.com/in/en/account/login");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	 

        }
        @Test  
        void logintest () {
        	WebElement login = driver.findElement(By.xpath( "//span[text()='My account']"));
        	System.out.println(login.getText());
        }
        @Test
        void moNumber () {
        	WebElement number = driver.findElement(By.xpath("//input[@id='phoneNo']"));
        	number.sendKeys("1123455677");
        }
        @Test
        void text () {
        	WebElement texti = driver.findElement(By.xpath("//div[text()='Login / Register']"));
        	System.out.println(texti.getText());
        }
        
        
        @AfterClass
	     void closeBrowser () {
	    	 driver.quit();
	    	 
	     }
	     
        
        
        
        
        
        
        
}
