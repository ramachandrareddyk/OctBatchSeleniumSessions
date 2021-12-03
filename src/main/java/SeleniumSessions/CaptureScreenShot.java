package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		Thread.sleep(3000);
		
		//take screenshot
		
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Store screenshot
		FileUtils.copyFile(screenshot, new File("C:\\Users\\ramachandra.reddy\\eclipse-workspace\\BatchOctoberSelenium\\Screenshots\\capture.png"));
		
		
		
		driver.quit();
	}

}
