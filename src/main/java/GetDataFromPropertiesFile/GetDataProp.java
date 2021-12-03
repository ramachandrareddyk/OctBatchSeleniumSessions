package GetDataFromPropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GetDataProp {

	public static void main(String[] args) throws IOException {

		String FilePath="C:\\Users\\ramachandra.reddy\\eclipse-workspace\\BatchOctoberSelenium\\src\\main\\java\\GetDataFromPropertiesFile\\Data.properties";

		//FileReader fr= new FileReader(FilePath);
		
		FileInputStream fi=new FileInputStream(FilePath);
		Properties p= new Properties();
		
		p.load(fi);
		
		System.out.println(p.getProperty("Url"));
		System.out.println(p.getProperty("Username"));
		System.out.println(p.getProperty("Password"));

	}

}
