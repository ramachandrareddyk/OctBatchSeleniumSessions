package SyncronaisationConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver, 20);
		
		
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.titleIs("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		
		WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
		
		searchBox.sendKeys("Apple Mobile");
		
		WebElement searchButton= driver.findElement(By.id("nav-search-submit-button"));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		
		searchButton.click();
	}

}
