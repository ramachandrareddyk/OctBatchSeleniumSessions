package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalanderHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("datepicker")).click();

		
		selectFutureData("February 2022", "2");
		
		
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	public static void selectFutureData(String expMonthYear, String Day) {
		if(Integer.parseInt(Day)>31) {
			System.out.println("Wrong date passed");
			return;
		}
		
		if(expMonthYear.contains("February")&& Integer.parseInt(Day)>29) {
			System.out.println("Wrong date passed");
			return;
		}
		
		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);
		while (!actMonthYear.equalsIgnoreCase(expMonthYear)) {
			// click on next:
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		}
		
		selectDay(Day);
		
	
	}
	public static void selectDay(String day) {
		driver.findElement(By.xpath("//a[text()='"+day+"']"));
	}

}
