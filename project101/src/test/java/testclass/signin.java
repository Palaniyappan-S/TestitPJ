package testclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class signin {
	
	// Webdriver object creation 
	WebDriver driver;
	
	@BeforeTest
	public void login() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\palam\\eclipse-workspace\\project101\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions chromeoptions = new ChromeOptions();
		driver = new ChromeDriver();
		driver.get("https://google.co.in");
		Thread.sleep(5000);
	}
	
	@Test
	public void sampleTest() {
		
		String s = driver.findElement(By.xpath("//a[@class='gb_q'][1]")).getText();
		Assert.assertEquals(s, "Gmail");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
