package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	WebDriver driver;
	
	public Youtube(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchField = By.xpath("//input[@id='search']");
	By searchButton = By.xpath("//button[@id='search-icon-legacy']");
	
	public void searchBand(String band) {
		driver.findElement(searchField).sendKeys(band);
	}
	
	public void clickSearch() {
		driver.findElement(searchButton).click();
	}
}
