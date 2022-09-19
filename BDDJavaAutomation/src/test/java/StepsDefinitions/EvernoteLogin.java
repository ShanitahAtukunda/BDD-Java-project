package StepsDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class EvernoteLogin {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("project path is :" +projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver");
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	    
	    driver.manage().window().maximize();
	    
		
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    
		driver.navigate().to("https://evernote.com/");
		
	}

	@And("user click login button")
	public void user_click_login_button() {
		
	    driver.findElement(By.linkText("Log In")).click();

	}

	@When("user enters email and password")
	public void user_enters_email_and_password() {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("coceyi5134@upshopt.com");
	    driver.findElement(By.xpath("//input[@id='loginButton']")).click();
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shanitah");
		
	}
	
	@And("user clicks the login button")
	public void user_clicks_the_login_button() {
		 driver.findElement(By.id("loginButton")).click();

	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		
		driver.findElement(By.id("qa-HOME_TITLE")).isDisplayed();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	    

	}

}
