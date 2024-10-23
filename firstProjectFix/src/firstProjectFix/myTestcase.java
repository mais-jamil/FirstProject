package firstProjectFix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestcase {
	
	
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	public void mySetup() {}
	
	
	@Test
	
	public void myTest() {
		
		driver.get("https://www.google.com");
	}
	
	
	@AfterTest
	
	public void myAfterTest() {}
	
	

}
