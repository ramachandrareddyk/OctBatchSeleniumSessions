package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHanleConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		
		
		Set<String>handle=driver.getWindowHandles();
		
		
		Iterator<String>it= handle.iterator();
		
		String ParentWindowID=it.next();
		
		System.out.println(ParentWindowID);
		
		String ChaildWindowIDit=it.next();
		System.out.println(ChaildWindowIDit);
		
		Thread.sleep(3000);
		
		driver.switchTo().window(ChaildWindowIDit);
		
		driver.close();
		driver.switchTo().window(ParentWindowID);
		
		System.out.println(driver.getTitle());
		//driver.close();
		
	}

}
