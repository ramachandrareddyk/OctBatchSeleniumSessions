package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement traget= driver.findElement(By.id("droppable"));
		
		Thread.sleep(3000);
		
		//act.clickAndHold(source).moveToElement(traget).release().build().perform();
		
		act.dragAndDrop(source, traget).perform();
		Thread.sleep(3000);
	}

}
