package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowser {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\ramachandra.reddy\\eclipse-workspace\\BatchOctoberSelenium\\Drivers\\geckodriver.exe");
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in");

	}

}
