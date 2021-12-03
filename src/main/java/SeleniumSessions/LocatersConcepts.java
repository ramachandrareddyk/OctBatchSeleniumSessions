package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatersConcepts {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
		
		Thread.sleep(4000);
		
		//1. Id
		
		//driver.findElement(By.id("identifierId")).sendKeys("ramureddy4555@gmail.com");
		
//		WebElement Email=driver.findElement(By.id("identifierId"));
//		Email.sendKeys("ramureddy4555@gmail.com");
//		Thread.sleep(8000);
		
		//2. Name
//		driver.findElement(By.name("identifier")).sendKeys("ramureddy4555@gmail.com");
//		
//		WebElement Email=driver.findElement(By.name("identifier"));
//		
//		Thread.sleep(3000);
//		Email.clear();
//		
//		Email.sendKeys("gopi@gmail.com");
//		
//		Thread.sleep(3000);
		
		//3. Class name
		
		//driver.findElement(By.className("zHQkBf")).sendKeys("gopi@gmail.com");
		
		//4.Css-Caskding style sheet
		//driver.findElement(By.cssSelector("#identifierId")).sendKeys("gopi@gmail.com");
		
		//5. Xpath
		
//		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("gopi@gmail.com");
//		Thread.sleep(3000);
		
		//6. Link text
		
//		driver.findElement(By.linkText("Learn more")).click();
//		driver.quit();
		
		//7. Partial link text
//		driver.findElement(By.partialLinkText("Learn")).click();
//		driver.quit();
//		
//		//8. Tag name
//		
//		driver.findElements(By.tagName("a"));
		
		//1. Id
		//driver.findElement(By.id("identifierId")).sendKeys("abc@gmail.com");
		//Recamanded
//		WebElement usrname= driver.findElement(By.id("identifierId"));
//		
//		usrname.sendKeys("identifierId");
		
		//2.Name
//		
//		WebElement usrname= driver.findElement(By.name("identifier"));
//		
//		usrname.sendKeys("abc@gmail.com");
		
		//3.Class Name
		
//		WebElement username= driver.findElement(By.className("zHQkBf"));
//		
//		username.sendKeys("abc@gmail.com");
		
		
		//4. Css = Caskading style sheet
		
//		WebElement username= driver.findElement(By.cssSelector("#identifierId"));
//		username.sendKeys("abc@gmail.com");
		
		//5. Xpath
		//Absolute xpath- Start with '/', Starts from base
		
		//Relative xpath- Start with '//', Starts from exact tag name
		
		
//		WebElement username = driver.findElement(By.xpath("//input[@id='identifierId']"));
//		username.sendKeys("abc@gmail.com");
//		
//		WebElement nxtBtn= driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
//		nxtBtn.click();
		
		//6. Tag name
		//driver.findElement(By.tagName("input")).sendKeys("Abc@gmail.com");
		
		//7. Link text
		
		//driver.findElement(By.linkText("Learn more")).click();
		
		
		//8. Partial link text
		
		driver.findElement(By.partialLinkText("Learn")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
