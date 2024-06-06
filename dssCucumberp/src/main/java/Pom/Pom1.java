package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {

	@FindBy(id="username")
	private WebElement USERNAME;

	@FindBy(id="password")
	private WebElement PASSWORD;
	
	@FindBy(id="submit")
	private WebElement LOGIN;
	

	
	public Pom1(WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	
	public void username() {
		USERNAME.sendKeys("student");
	}
	public void password() {
		PASSWORD.sendKeys("Password123");
	}
	public void login()	{
		LOGIN.click();
	}
	
	
	
}
