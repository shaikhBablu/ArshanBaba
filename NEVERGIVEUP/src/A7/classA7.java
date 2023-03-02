package A7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classA7 {
	WebDriver driver;
	
	
	@BeforeTest
	void setUp ( ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ideal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	@BeforeClass
	void launchURL ()  {
		driver.get("https://www.1mg.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
    @Test  (priority = 1)
	void logotest () {
    WebElement titletest = driver.findElement(By.xpath("//img[@alt='1mg, best e pharmacy in India']"));
    if (titletest.isDisplayed())  {
        	System.out.println("logo is diplying");
        }	
    else {
        	System.out.println("logo is not diplaying ");
        }
		}
    
    
    @Test (priority = 2)
    void text () {
        WebElement textfield = driver.findElement(By.xpath("//h1[text()='Tata 1mg: India’s Leading Online Pharmacy & Healthcare Platform']"));
        System.out.println(textfield.getText());
        }
        
        @AfterClass 
    void closeBrowser ()  {
    	driver.quit ();
    }
    
    
        
		}
	
	
	
	
	

