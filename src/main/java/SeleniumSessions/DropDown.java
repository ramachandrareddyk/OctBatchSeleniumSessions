package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		WebElement Country = driver.findElement(By.id("Form_submitForm_Country"));
		
		Select dropdown=new Select(Country);
//		
//		//dropdown.selectByVisibleText("India");
//		//dropdown.selectByIndex(5);
//		
		dropdown.selectByValue("indi");
//		Thread.sleep(5000);
		
		
		//SelectDropDownByText(Country,"India");
		//SelectDropDownValue("Indi");
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}
	
	public static void SelectDropDownValue(String Value) {
		
		WebElement Country = driver.findElement(By.id("Form_submitForm_Country"));
		
		Select dropdown=new Select(Country);
		
		List<WebElement>OptionsList=dropdown.getOptions();
		
		System.out.println(OptionsList.size());
		
		for(WebElement e: OptionsList) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(Value)) {
				e.click();
				break;
			}
		}
		
		
	}
	
	public static void SelectDropDownByText(WebElement element, String Value) {
		Select dropdown=new Select(element);
		dropdown.selectByVisibleText(Value);
	}
		

}
