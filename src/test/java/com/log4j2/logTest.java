package com.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class logTest {
	
	

		private static Logger demologger=  (Logger) LogManager.getLogger(logTest.class.getName());
		
		public static void main(String[] args) throws Exception {
			
	        
	       
			demologger.trace("hvwfwekjsdfk");
			demologger.error("kbfkjfbke");
			demologger.info("svdkjbfksd");
			demologger.fatal("iugbakndka");
			if(5>4)
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

