package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver;
	
	@Given("^i launch url in browser$")
	public void i_launch_url_in_browser() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com");
	    
	}

	@When("^i enter user name$")
	public void i_enter_user_name() throws Throwable {
	    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	   
	}

	@When("^i enter password$")
	public void i_enter_password() throws Throwable {
		 driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	   
	}

	@When("^i click on login button$")
	public void i_click_on_login_button() throws Throwable {
		 driver.findElement(By.name("Submit")).click();
	    Thread.sleep(4000);
	}

	@Then("^i validate url$")
	public void i_validate_url() throws Throwable {
	   if(driver.getCurrentUrl().contains("dashboard"))
	   {
		   System.out.println("Login success");
	   }
	   else
	   {
		   System.out.println("Login Fail");
	   }
	}

	@Then("^i close browser$")
	public void i_close_browser() throws Throwable {
	    driver.close();
	}
	
}
