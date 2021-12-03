package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame("content");
		
		String a= driver.findElement(By.xpath("//p[@class='byline']")).getText();
		
		System.out.println(a);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("navbar");
		
		String B= driver.findElement(By.xpath("//h3")).getText();
		
		System.out.println(B);
		
		Thread.sleep(5000);
		
		
		driver.quit();
	
	}

}
