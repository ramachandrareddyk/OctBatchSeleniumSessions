package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramachandra.reddy\\eclipse-workspace\\BatchOctoberSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver Driver= new ChromeDriver();//launch browser
		
		/*
		 * Driver.get("https://www.google.com/"); //eneter URL
		 * System.out.println(Driver.getTitle());
		 */
		
		Driver.navigate().to("https://www.google.com/");
		System.out.println(Driver.getTitle());
	}

}
