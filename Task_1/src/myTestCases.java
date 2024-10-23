import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {
	
	WebDriver driver = new ChromeDriver();
	
	String thewebsite = "https://www.saucedemo.com/";
	String theusername = "standard_user";
	String thepassword = "secret_sauce";
	
	@BeforeTest
	public void setup() {
		driver.get(thewebsite);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void login() {
		
		WebElement usernameInput = driver.findElement(By.id("user-name"));
		usernameInput.sendKeys(theusername);
		WebElement passwordInput = driver.findElement(By.id("password"));
		passwordInput.sendKeys(thepassword);
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
	}
	
	@Test(priority = 2)
	public void AddItemToCart() {
		List<WebElement> AddToCartBtn = driver.findElements(By.className("btn"));
		for (int i = 0; i<AddToCartBtn.size(); i++) {
			AddToCartBtn.get(i).click();
		}
	}

}
