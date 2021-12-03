package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions act= new Actions(driver);
		
		WebElement rightClick= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		act.contextClick(rightClick).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
