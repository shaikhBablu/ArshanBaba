package Demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classDemo {
                 
	                WebDriver driver;
	@BeforeTest
    void setUp ()  {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ideal\\Downloads\\chromedriver_win32\\chromedriver.exe");
 	    driver = new ChromeDriver();
	}
	
 	@BeforeClass   
 	void launchUrl() {
 		
 		driver.get("https://in.bookmyshow.com/explore/home/nanded");
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		
 	}
	@Test
	void moovies() {
		WebElement m1 = driver.findElement(By.xpath("(//a[text()='Movies'])[1]"));
		m1.click();
	}
	@Test
	void inside () {
		WebElement insidetext = driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']"));
	    System.out.println(insidetext.getText());
		
	}
	@Test
	void Screenshot1() throws IOException {
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File learn2 = new File("C:\\Users\\Ideal\\eclipse-workspace\\NEVERGIVEUP\\src\\Screenshot\\tc1.jpg");
	    FileHandler.copy(src1, learn2);
	}
	
	
	
	
	@Test
	void sclick() {
		WebElement signup = driver.findElement(By.xpath("//div[text()='Sign in']"));
		signup.click();
	}
	
	@Test
	void scrrenshot() throws IOException {
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		File learn = new File("C:\\Users\\Ideal\\eclipse-workspace\\NEVERGIVEUP\\src\\Screenshot\\tc.jpg");
		FileHandler.copy(src, learn);
	}
	
	
	@AfterClass
	void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
