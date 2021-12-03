package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		Thread.sleep(3000);
		
	   WebElement UserName=driver.findElement(By.id("ap_email"));
		
		WebElement CtnBtn=driver.findElement(By.id("continue"));
		
		Actions act= new Actions(driver);
//		
//		act.sendKeys(UserName, "ramureddy4555@gmail.com").perform();
//		
//		act.click(CtnBtn).perform();
		
		
		//act.moveToElement(UserName).sendKeys("ramureddy4555@gmail.com").build().perform();
		
		//act.moveToElement(CtnBtn).click().build().perform();
		doActionSendKeys(UserName, "ramureddy4555@gmail.com");
		
		doActionClick(CtnBtn);
		
		Thread.sleep(3000);
		
		
		
		driver.quit();
	}
	
	public static void doActionSendKeys(WebElement element, String value) {
		Actions act= new Actions(driver);
		act.sendKeys(element, value ).perform();
	}
	
	public static void doActionClick(WebElement element) {
		Actions act= new Actions(driver);
		act.click(element ).perform();
	}
	
	

}
