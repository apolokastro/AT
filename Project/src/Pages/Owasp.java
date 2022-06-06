package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Owasp {
	WebDriver driver;
	
	public Owasp(WebDriver driver) {
		this.driver = driver;
	}
	
	By dismissButton = By.xpath("//span[contains(text(),'Dismiss')]");
	By menuButton = By.xpath("//*[text()='menu']");
	By gitHub = By.xpath("//span[contains(text(),'GitHub')]");
	
	public void dismiss() {
		driver.findElement(dismissButton).click();
	}
	
	public void clickMenu() {
		driver.findElement(menuButton).click();
	}
	
	public String gitOption() {
		return driver.findElement(gitHub).getText();
		
	}
	
}
