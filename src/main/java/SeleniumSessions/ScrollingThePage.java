package SeleniumSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingThePage {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://www.crmpro.com");
		
		WebElement FrogetPassword= driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
		
		Thread.sleep(3000);
		
		//scrollDOwn();
		
		scrollUpToWebElement(FrogetPassword);
		Thread.sleep(3000);
		
		//scrollUp();
		//scrollPageDOwn("300");
		
	}

	
	
	public static void scrollDOwn() {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollPageDOwn(String Hight) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,'"+Hight+"')");
	}
	
	public static void scrollUp() {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
public static void scrollUpToWebElement(WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}
