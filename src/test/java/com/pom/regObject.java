package com.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class regObject {

  static  WebDriver driver;
   
      regObject(WebDriver driver)
      {
	 
	  this. driver= driver;
	  PageFactory.initElements(driver, this);
	  
      }
 
     @FindBy(id="firstName") WebElement fn;
     
      
      @FindBy(id="lastName")
      WebElement ln;
      
      @FindBy(id="femalerb")
      WebElement fb;
      
      @FindBy(id="malerb")
      WebElement mb;
      
      @FindBy(id="hindichbx" )
      WebElement hb;
      
      @FindBy(id="email")
      WebElement em;
      
      @FindBy(id="password")
      WebElement pa;
      
      @FindBy(id="registerbtn")
      WebElement rb;
      
      
      public void first(String f1) {
    	  	  fn.sendKeys(f1);
      }
      public void last(String f2) {
    	  ln.sendKeys(f2);
      }
      public void feme() {
        fb.click();
      }
      public void meme() {
    	  mb.click();
      }
      public void lang() {
    	  hb.click();
      }
      public void emem(String f3) {
    	em.sendKeys(f3);
      }
      public void pass(String f4) {
    	 pa.sendKeys(f4);
      }
      public void rege() {
    	  rb.click();
      }
 	
}
