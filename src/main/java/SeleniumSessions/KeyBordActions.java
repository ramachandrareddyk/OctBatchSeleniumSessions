package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBordActions {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		 DesiredCapabilities caps= new DesiredCapabilities();
		 caps.setAcceptInsecureCerts(true);
		 
		 ChromeOptions option= new ChromeOptions();
		 //option.
		driver.get("https://demoqa.com/text-box");
		
		WebElement FullName= driver.findElement(By.id("userName"));
		
		WebElement Email= driver.findElement(By.id("userEmail"));
		
		WebElement submitButton= driver.findElement(By.id("submit"));
		
		FullName.sendKeys("Ramachandra");
		Thread.sleep(3000);
		FullName.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		submitButton.sendKeys(Keys.ENTER);
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}


}
