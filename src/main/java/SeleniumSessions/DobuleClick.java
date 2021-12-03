package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DobuleClick {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions act= new Actions(driver);
		
		WebElement dobuleClick= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Thread.sleep(2000);
		act.doubleClick(dobuleClick).perform();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
