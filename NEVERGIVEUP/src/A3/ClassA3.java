package A3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassA3 {
	  WebDriver driver;
	 
	  @BeforeTest
      void setUp ()  {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ideal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();

      }
	  
	  @BeforeClass
	  void launchURL () {
	    driver.get("https://pharmeasy.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  @Test ( priority= 4)
	  void searchbar () {
		  WebElement searchclick = driver.findElement(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-icOztnM-css']"));
		  searchclick.click();
 	  }
	  @Test (priority = 2)
	  void logotest () {
		  WebElement logo = driver.findElement(By.xpath("(//img[@alt='pharmeasy-logo'])[1]"));
		  if (logo.isDisplayed()) {
			  System.out.println("logo is properly displayed");
		  }
		  else {
			  System.out.println("logo is not displayed");
	  }
	  }
	  @Test (priority = 3)  
	  void texttest ()  {
		  WebElement textfield = driver.findElement(By.xpath("//span[text()='What are you looking for?']"));
	      if (textfield.isDisplayed()) {
	    	  System.out.println("text is properly displaying");
	      }
	      else {
	    	  System.out.println("text is not dislaying properly");
	      }
	      }
      @Test (priority = 1)
	  void dynamix () {
		  WebElement dyan = driver.findElement(By.xpath("//img[@alt='Medicine UPTO 20% OFF']"));
	      dyan.click();
	      
	      
	  }
	  
		  
	  
		
	}
	      

