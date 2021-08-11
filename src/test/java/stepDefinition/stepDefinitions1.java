package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions1 {
		WebDriver driver;
	@Given("^user launch url in \"([^\"]*)\"$")
	public void user_launch_url_in(String brw) throws Throwable {
	    
		if(brw.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
			driver = new ChromeDriver();
			driver.get("http://orangehrm.qedgetech.com");
		}
		/*else if (brw.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
			driver.get("");
		}*/
		
		else
		{
			System.out.println("Browser value is not matching");
		}
	}

	@When("^user enter \"([^\"]*)\" in textbox$")
	public void user_enter_in_textbox(String username) throws Throwable {
	    
		 driver.findElement(By.name("txtUsername")).sendKeys(username);
	}
	
	@When("^user enter \"([^\"]*)\" textbox$")
	public void user_enter_textbox(String password) throws Throwable {
	    driver.findElement(By.name("txtPassword")).sendKeys(password);
	
	}
	@When("^user click on login$")
	public void user_click_on_login() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^user validate url$")
	public void user_validate_url() throws Throwable {
		 if(driver.getCurrentUrl().contains("dashboard"))
		   {
			   System.out.println("Login success");
		   }
		   else
		   {
			   System.out.println("Login Fail");
		   }
	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
	    driver.close();
	}


}
