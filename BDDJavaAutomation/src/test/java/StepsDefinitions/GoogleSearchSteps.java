//package StepsDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//
//public class GoogleSearchSteps {
//	
//	WebDriver driver = null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("project path is :" +projectPath);
//		
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver");
//	    driver = new ChromeDriver();
//	    
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//	    
//	    driver.manage().window().maximize();
//	}
//
//	@And("user is on the google search box")
//	public void user_is_on_the_google_search_box() {
//		
//		driver.navigate().to("https://google.com");
//	    
//	}
//
//	@When("user enters a text in the google search boc")
//	public void user_enters_a_text_in_the_google_search_boc() {
//		
//		driver.findElement(By.name("q")).sendKeys("selenium");
//	    
//	}
//
//	@And("hits Enter")
//	public void hits_enter() {
//		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	    
//	}
//
//	@Then("user is navigated to results page")
//	public void user_is_navigated_to_results_page() {
//		
//		driver.getPageSource().contains("Selenium");
//		driver.close();
//		driver.quit();
//	    
//	}
//
//
//}
