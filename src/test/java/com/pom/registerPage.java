package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registerPage {

	
	WebDriver driver;
	
	registerPage(WebDriver driver)
	{
	    this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement reglink;
	
	@FindBy(name="firstName")
	WebElement fN;
	
	@FindBy(name="lastName")
	WebElement LN;
	
	@FindBy(name="phone")
	WebElement ph;
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="address1")
	WebElement add1;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement pin;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement pa;
	
	@FindBy(name="confirmPassword")
	WebElement cp;
	
	@FindBy(name="submit")
	WebElement regbutton;
	
	
	
	
	public void clickRegLink() {
		reglink.click();
	}
	public void setFirstName(String fname) {
		fN.sendKeys(fname);
	}
	public void setLastName(String lname) {
		LN.sendKeys(lname);
	}
	public void Phone(String phone) {
		ph.sendKeys(phone);
	}
	public void userName(String us) {
		username.sendKeys(us);
	}

	public void Address(String adde) {
		add1.sendKeys(adde);
	}
	public void City(String addee) {
		city.sendKeys(addee);
	}
	public void State(String st) {
		state.sendKeys(st);
	}
	public void PostalCode(String pinn) {
		pin.sendKeys(pinn);
	}
	public void con(String coun) {
		Select sec= new Select(country); 
		sec.selectByValue(coun);
		}
	public void Email(String emaill) {
		email.sendKeys(emaill);
	}
	public void Password(String pinn) {
		pa.sendKeys(pinn);
	}
	public void confirmPassword(String pinn) {
		cp.sendKeys(pinn);
	}
	public void button() {
		regbutton.click();
		
		
	}
	
	
}
