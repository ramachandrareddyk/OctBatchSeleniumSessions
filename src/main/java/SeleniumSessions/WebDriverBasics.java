package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramachandra.reddy\\eclipse-workspace\\BatchOctoberSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver Driver= new ChromeDriver();//launch browser
		
		Driver.get("https://www.google.com/"); //eneter URL
		String title=Driver.getTitle();//get title
		
		System.out.println(title);
		
		//AutomationSteps + Verification= Automation testing
		
		if(title.equals("Google")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is wrong");
		}
		
		
		System.out.println(Driver.getCurrentUrl());//Get current URL

		
		Driver.getPageSource();

		//Driver.quit();
		
		Driver.close();
		
		Driver.getTitle();
		
	}

}
