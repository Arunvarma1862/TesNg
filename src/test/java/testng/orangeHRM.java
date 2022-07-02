package testng;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHRM {
	
	WebDriver driver;
	
	@Parameters("broswerName")
	@BeforeTest
	
	    public void intializeBrowser(@Optional("chrome")  String broswerName) {
		switch (broswerName.toLowerCase()) 
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		    break;
		default:
			System.out.println("broswerName is invalid");
			break;
		}
		
	}
	@Parameters("sleeptime")
	@AfterTest
	
	    public void TearDown(long sleeptime) throws Exception {
		Thread.sleep(sleeptime);
		driver.quit();
	}
	
	
	@Parameters("url")
	@Test 
	public void LaunchApp(String url) throws Exception {
	
		driver.get(url);
	}
	
	
	@Parameters({"username","password"})
	@Test
	public void loginDetails(String Username ,String password) throws Exception {


		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	@Test
	public void NavigateToMyInfo() {
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}
	
	
	@Test
	public void VerifyMyinfo() {
		boolean actualValue=driver.findElement(By.id("employee-details")).isDisplayed();
		assertTrue(actualValue);
		
	}
	
	
	@Test
	public void VerifyLogin() {
		WebElement element=driver.findElement(By.id("welcome"));
		assertTrue(element.isDisplayed());
		assertTrue(element.getText().startsWith("Welcome"));
		
		
		
	
	}

}
