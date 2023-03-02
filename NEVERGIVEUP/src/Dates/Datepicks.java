package Dates;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ideal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/your-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		                 
                
        WebDriverWait mywaits = new WebDriverWait(driver, Duration.ofSeconds(10));        
        WebElement sname = mywaits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']")));
		System.out.println(sname.getText());
		
		WebElement framing1 = driver.findElement(By.xpath("(//div[@class=\"a-box-inner\"])[1]"));
		framing1.click();
		
	}

}
