package SyncronaisationConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//Thread.sleep(3000);//static wait
		
		//is only web Elements
		//it's aglobal wait- applied for all the webelements
		//it will not applicable for title, Alerts, url
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
		
		searchBox.sendKeys("Apple Mobile");
		
		WebElement searchButton= driver.findElement(By.id("nav-search-submit-button"));
		
		searchButton.click();
		
	}

}
