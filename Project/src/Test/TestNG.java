package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.*;

public class TestNG {
	WebDriver driver;
	Owasp obj;
	
	String baseUrl = "https://juice-shop.herokuapp.com/";
	
	@Test
	public void TC1() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		String testTitle = "OWASP Juice Shop";
		String currentTitle = driver.getTitle();
		Assert.assertEquals(currentTitle, testTitle);
	}
	
	@Test
	public void TC2() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		obj = new Owasp(driver);
		obj.dismiss();
		obj.clickMenu();
		Thread.sleep(1000);
		Assert.assertEquals(obj.gitOption(), "GitHub");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rodol\\Documents\\Training\\plugins\\chromedriver.exe");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		System.out.println("Test Finished");
	}

}
