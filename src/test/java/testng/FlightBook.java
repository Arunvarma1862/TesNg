package testng;

import org.testng.annotations.Test;

public class FlightBook {
	
	@Test(priority=-1)
   public void signUp() {
	   System.out.println("signup");
   }
	@Test
	 public void login() {
		   System.out.println("login");
	   }
	@Test(priority=3)
	 public void searchForFlight() {
		   System.out.println("searchForFlight");
	   }
	@Test(priority=4)
	 public void bookTheFlight() {
		   System.out.println("bookTheFlight");
	   }
	@Test(priority=5)
	 public void saveTheTicket() {
		   System.out.println("saveTheTicket");
	   }
	@Test(priority=6)
	 public void logout() {
		   System.out.println("logout");
	   }
}
