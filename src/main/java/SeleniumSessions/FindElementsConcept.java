package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Amazon.in");
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		for(int i=0;i<Links.size();i++) {
			String linkText=Links.get(i).getText();
			
			if(!linkText.isEmpty()) {
				System.out.println(i+"--->"+linkText);
			}
		}

	}

}
