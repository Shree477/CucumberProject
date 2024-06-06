package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {

	@FindBy(xpath="//a[@href='https://practicetestautomation.com/']")
	private WebElement HOME;
	

	public Pom2(WebDriver driver){
		PageFactory.initElements(driver, this);}
		
	
	public void home() {
	
		if(HOME.isDisplayed()) {
			System.out.println("Test case is Passed");
		}
		else {
			System.out.println("Test case is Failed");
		}
	}

}
