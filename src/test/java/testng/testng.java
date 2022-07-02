package testng;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng {
	@Test
    public void TestGoogle() throws Exception {
		
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.co.in/");
    	driver.findElement(By.name("q")).sendKeys("hello",Keys.ENTER);
    	
    	String ExpectedResult= "hello - Google Search";
    	String actuaLresult=  driver.getTitle();
        assertEquals(actuaLresult,ExpectedResult,"title is mismatched");
        
    	System.out.println(driver.getTitle());
    	Thread.sleep(2000);
    	driver.quit();
    }
	@Test
	 public void TestFacebook() throws Exception {
		
	    	WebDriverManager.chromedriver().setup();
	    	WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.get("https://www.facebook.com/");
	    	driver.findElement(By.name("email")).sendKeys("hello",Keys.ENTER);
	    	Thread.sleep(2000);
	    	
	    	SoftAssert sa= new SoftAssert();
	    	
	    	// title assertion
	    	
	    	String actualTitle=driver.getTitle();
	        String expectedtitle="Facebook – log in or sign up";
	        sa.assertEquals(actualTitle, expectedtitle,"title is mismatched");
	    	
	        // url Assertion
	        
	        String actualURL=driver.getCurrentUrl();
	        String expectedURL="https://www.facebook.com/";
	        sa.assertNotEquals(actualURL, expectedURL,"URL is mismatched");
	        
	        
	        //TextAssertion
	        
	        String actualText=driver.findElement(By.id("email")).getAttribute("value");
	        String expectedText="";
	        sa.assertEquals(actualText, expectedText,"text is mismatched");
	        
	        //border assertion
	        String actualborder=driver.findElement(By.id("email")).getCssValue("border"); 
	        String expectedborder="1px solid rgb(240, 40, 73)";                               //2 hex(#f02849) to rgb(240,40,73)
	        sa.assertEquals(actualborder, expectedborder," border is mismatched");
	        
	    	
	    	driver.quit();
	    	sa.assertAll();
	 }    
	
}
