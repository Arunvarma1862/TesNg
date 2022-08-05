package com.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class logTest {
	
	

		public static Logger logger=	(Logger) LogManager.getLogger(logTest.class.getName());
	
		
		public static void main(String[] args) throws Exception {
			
			
			
			logger.info("hello");                
			logger.fatal("bye");
			logger.trace("world");
			logger.error("mjbdj");
			
			
			
			/* Fatal-100
			 * error-200
			 * warn-300
			 * info-400
			 * debug-500
			 * trace-600
			 */
			
		
	       
		
		/*	if(5>4)
				demologger.info("sdkfkak");
		     	demologger.error("agfhkfakfhka");
			
		//	Logger logger=Logger.getLogger("log4jTest");
		//	DOMConfigurator.configure("log4j.xml");
			
			/*WebDriverManager.chromedriver().setup();
	    	WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	
	    	demologger.trace("browser open");
	    	driver.get("https://www.google.co.in/");
	    	
//	    	logger.info("enter text");
	    	driver.findElement(By.name("q")).sendKeys("hello",Keys.ENTER);
	    	
	    	String ExpectedResult= "hello - Google Search";
	    	String actuaLresult=  driver.getTitle();
	    	assertEquals(actuaLresult,ExpectedResult,"title is mismatched");
	    	System.out.println(driver.getTitle());
	    	Thread.sleep(2000);
	    	driver.quit();*/
			
		}
	}

