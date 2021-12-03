package GetDataFromPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	static String FilePath="C:\\Users\\ramachandra.reddy\\eclipse-workspace\\BatchOctoberSelenium\\src\\main\\java\\GetDataFromPropertiesFile\\Data.properties";

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		FileInputStream fi=new FileInputStream(FilePath);
		Properties p= new Properties();
		
		p.load(fi);
		
		String URl= p.getProperty("Url");
		
		driver.get(URl);
	}

}
