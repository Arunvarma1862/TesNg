package com.capturescreenshots;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends BaseCsTest implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		/*System.out.println(result.getMethod().getMethodName());
	    captureS(result.getMethod().getMethodName()+".jpg");*/
		
	    System.out.println( result.getTestContext().getName()+"_"+ result.getMethod().getMethodName());
	    captureS( result.getTestContext().getName()+"_"+ result.getMethod().getMethodName()+".jpg");
	}

}
