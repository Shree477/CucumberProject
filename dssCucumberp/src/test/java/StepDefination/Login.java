package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pom.Pom1;
import Pom.Pom2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static Pom1 p1;
	public static Pom2 p2;
	public WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		//System.setProperty("webdriver.chrome.driver","C://Chrome Driver//chromedriver-win64//chromedriver-win64//chromedriver.exe/");
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
	        
	     driver = new ChromeDriver(co);
	    
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	    driver.manage().window().maximize();
	    
	
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
	
		p1=new Pom1(driver);
		p1.username();
		p1.password();
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		
	p1.login();    
	}

	@Then("user is navigate to the homepage")
	public void user_is_navigate_to_the_homepage() {
	
		Pom2 p2=new Pom2(driver);
		p2.home();
	}
}
