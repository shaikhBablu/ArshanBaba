package NAvigat;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classnavigate {
                  
	                  WebDriver driver;
	
	
	
	    @BeforeTest   
	    void setUp () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ideal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    }
		
		@BeforeClass   
		void dressUrl () {
		driver.get("https://pharmeasy.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		@Test
		void a1 ()  {
        String title = driver.getTitle();
		System.out.println(title);
		
		
		}
		@Test
		void a2 () {
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		}
		@Test
		void a3 ()  {
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		}
		
		@AfterClass
		void closeBrowser () {
			driver.close();
		}
		
	}


