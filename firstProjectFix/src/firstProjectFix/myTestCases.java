package firstProjectFix;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {
	
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	public void mySetup() {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void myTest() {
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Mais Jamil" + Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/h3/span")).click();		
		
	}
	
	
	
	
	@AfterTest
	public void myAfterTest() {
		
	}

}
