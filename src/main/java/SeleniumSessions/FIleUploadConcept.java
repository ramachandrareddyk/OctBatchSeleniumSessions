package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FIleUploadConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement ChooseFile=driver.findElement(By.name("upfile"));
		
		ChooseFile.sendKeys("C:\\Users\\ramachandra.reddy\\Desktop\\My Testing\\Sample CV.docx");
		
		Thread.sleep(3000);
		
	}

}
