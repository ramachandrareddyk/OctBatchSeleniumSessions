package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsAlertPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		
		Thread.sleep(3000);
		
	Alert aa=driver.switchTo().alert();
	
	
	System.out.println(aa.getText());
	
	aa.accept();
	
	//driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//	
//		
//		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
//	Thread.sleep(3000);
//	
//	Alert aa=driver.switchTo().alert();
//	
//	aa.sendKeys("This is my Alert");
//	Thread.sleep(5000);
//	
//	aa.accept();		
		driver.quit();
	}

}
