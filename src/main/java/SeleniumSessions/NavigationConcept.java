package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramachandra.reddy\\eclipse-workspace\\BatchOctoberSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver Driver= new ChromeDriver();//launch browser
		
		Driver.get("https://www.google.com/"); //eneter URL
		System.out.println(Driver.getTitle());
		
		Driver.navigate().to("https://www.amazon.in");
		System.out.println(Driver.getTitle());
		
		Driver.navigate().back();
		System.out.println(Driver.getTitle());
		
		Driver.navigate().forward();
		System.out.println(Driver.getTitle());
		
		Driver.navigate().refresh();
		
		Driver.quit();
	}

}
