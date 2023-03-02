package A6;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassA6 {
	   @BeforeClass
	   void setUp () {
		   System.out.println("set up is done ");
	   }
	
       @BeforeMethod
	   void LaunchBrowser () {
		   System.out.println("browser got launched successfully");
	   }

	   @Test
	   void testA () {
		   System.out.println("this is test a");
	   }
	   @Test
	   void testB () {
		   System.out.println("this is test B");
	   }
	   @Test
	   void testC () {
		   System.out.println ("this is test c");
	   }
	   @AfterMethod
	   void quiteBrowser() {
		   System.out.println("browser got closed successfully");
		   
	   }   
	   @AfterClass
	   void setup() {
		   System.out.println("set up is closed");
	   }
		   
		   
	   
}
