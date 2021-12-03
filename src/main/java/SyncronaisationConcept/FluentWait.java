package SyncronaisationConcept;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {

	 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
		

		fluentWait(searchBox,10,2);
		
		
		
	}

	
	
	public static void fluentWait(WebElement element, int time, int pollingTime) {
		Wait<WebDriver> wait= new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(time))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class);
				
				
		
	}
}
