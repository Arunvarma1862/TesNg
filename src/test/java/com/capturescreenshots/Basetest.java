package com.capturescreenshots;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	
	public static WebDriver driver;
	public static String screenshotsubfolderName;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	
	@Parameters("browserName") 
	@BeforeTest
	public void setup(ITestContext context, @Optional("chrome")  String browserName) 
	{
      switch(browserName.toLowerCase()) {
      case "chrome":
    	  WebDriverManager.chromedriver().setup();
  		  driver = new ChromeDriver();
  		  break;
      case "edge":
    	  WebDriverManager.edgedriver().setup();
  		  driver = new EdgeDriver();
  		  break;
       default:
            System.out.println("invalid browser");
    	    break;
  		  
      }
      driver.manage().window().maximize();
      
      Capabilities cap=((RemoteWebDriver)driver).getCapabilities();
      String device= cap.getBrowserName()+" "+cap.getVersion().substring(0, cap.getVersion().indexOf("."));
      String author= context.getCurrentXmlTest().getParameter("Author");
      extentTest=  extent.createTest(context.getName());	
      extentTest.assignAuthor(author);
      extentTest.assignDevice(device);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	
	@BeforeSuite
	public void intializeExtentReport() {
		
		 extent = new ExtentReports();
		 ExtentSparkReporter spark_All = new ExtentSparkReporter("AllTests.html");
		 spark_All.config().setReportName("AllTestsCases report");
		 spark_All.config().setTheme(Theme.DARK);
		 spark_All.config().setTimeStampFormat("dd-MM-yyyy hh:mm:ss");
		 spark_All.config().setDocumentTitle("TestCasesAll");
		 spark_All.config().setCss(".badge-primary{background-color: #4a142b }");
		 spark_All.config().setJs("document.getElementsByClassName(\"logo\")[0].style.display='none';");
		 
		   
		 ExtentSparkReporter sparkFail= new ExtentSparkReporter("failed.html");
		 sparkFail.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
		 sparkFail.config().setReportName("failure report");
		   
		  
		 extent.setSystemInfo("OS", System.getProperty("os.name"));
		 extent.setSystemInfo("JAVA VERSION", System.getProperty("java.version"));
		 
		 
		 extent.attachReporter(spark_All,sparkFail);
		
	}
	
	
	@AfterSuite
	public void generateExtentReport() throws Exception {
		
		extent.flush();
		Desktop.getDesktop().browse(new File("AllTests.html").toURI());
		Desktop.getDesktop().browse(new File("failed.html").toURI());
	}
	
	
	
	@AfterMethod
	public void checkStatus(Method m,ITestResult result) {
		
		if(result.getStatus()==result.FAILURE)
         {
			String screenshotpath=null;
			screenshotpath=	captureS( result.getTestContext().getName()+"_"+ result.getMethod().getMethodName()+".jpg");
			extentTest.addScreenCaptureFromPath(screenshotpath);
			extentTest.fail(result.getThrowable());
		}
		else if(result.getStatus()==result.SUCCESS) {
			extentTest.pass(m+"  it is passed  ");
			
		}
		    extentTest.assignCategory(m.getAnnotation(Test.class).groups());
		
	}
	
	
	
	public String captureS(String fileName)
	{
		if(screenshotsubfolderName == null)
		{
			LocalDateTime myDateObj = LocalDateTime.now();


			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");

			screenshotsubfolderName= myDateObj.format(myFormatObj);


		}


		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/"+screenshotsubfolderName+"/"+fileName);
		try
		{
			FileUtils.copyFile(src, dst);
		}
		catch (IOException e)
		{

			e.printStackTrace();
		}
		System.out.println("screenshot saved succesfully");

		return dst.getAbsolutePath();
    

	}
	
}
