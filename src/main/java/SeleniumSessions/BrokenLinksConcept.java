package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksConcept {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Amazon.in");
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());

		for(int i=0;i<Links.size();i++) {
			WebElement element= Links.get(i);
			
			String url=element.getAttribute("href");
			
			voidverifyLink(url);
		}
		
		
		
		
		
		
		driver.quit();
	}
	
	
	public static void voidverifyLink(String UrlLink) throws MalformedURLException {
		try {
		URL link = new URL(UrlLink);
		
		HttpURLConnection httpcon=(HttpURLConnection) link.openConnection();
		
		httpcon.setConnectTimeout(2000);
		
		httpcon.connect();
		
		if(httpcon.getResponseCode()==200) {
			System.out.println(UrlLink+" = "+httpcon.getResponseMessage());
		}
		if(httpcon.getResponseCode()==404) {
			System.out.println(UrlLink+" = "+httpcon.getResponseMessage());
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

}
