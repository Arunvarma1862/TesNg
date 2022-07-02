package com.dependencies;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Testdependent {
	
	static String trackNumber=null;
	 
	  @Test
      public void createShipement()
	  {
		  System.out.println(5/0);
		  System.out.println("createShipement");
		  trackNumber="ashjkb2356";
	  }
	  

  @Test(dependsOnMethods = {"createShipement"},alwaysRun = true)                      //alwaysRun = true
  public void trackShipement() throws Exception                                       // ignoreMissingDependencies = true
     {
	  if(trackNumber!=null)
	  {
		  System.out.println("trackShipement");
	  }
	  else
		  throw new Exception("invalid tracking number");
	  
      }
  
  
  @Test(dependsOnMethods = {"createShipement","trackShipement"},ignoreMissingDependencies = true)
  public void cancelShipement() throws Exception {
	  
	  if(trackNumber!=null) 
	  {
	  System.out.println("cancelShipement");
      }
	  else
		  throw new Exception("invalid tracking number");
      }
}
