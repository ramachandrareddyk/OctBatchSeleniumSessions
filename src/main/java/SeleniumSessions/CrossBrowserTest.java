package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		String Browser="i";
		
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(Browser.equalsIgnoreCase("FF")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		} else if(Browser.equalsIgnoreCase("ie")) {
			
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		} else {
			System.out.println("Pass the correct browser");
		}
		
		driver.get("https://www.amazon.in");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
