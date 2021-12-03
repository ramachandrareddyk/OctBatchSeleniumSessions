package SeleniumSessions;

public class XpathConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//xml path
		
		//Absalute expath- starts with '/', 
		
		// /html/body/form/table/tbody/tr[1]/td[2]/input
		//Relative xpath- starts with '//'
		//input[@type='text']
		
		
		//1. Contains();
		//input[contains(@type,'submit')]
		//label[contains(@id,'message23')]
		
		//2. OR & And
		
		//input[@type='submit' or @name='btnReset']
		//input[@type='submit' or @name='btnLogin']
		//input[@type='submit' or @name='btnReset'][1]
		
		//input[@type='text' and @name='uid']
		
		//3. Starts-with()
		
		//<input id =test123>
		//<input id =test163>
		//<input id =test129>
		
		
		//4.starts-with()
		//*[starts-with(@id,'message23')]
		
		//5.text()
		
		//td[text()='UserID']
		////td[text()='Password']
		
		
		//6. Following
		
		//input[@type='text']//following::td[1]
		
		//7. Ancestor
		//*[text()='ETL Testing']//ancestor::ul
		
		//7. child
		//*[@id='java_technologies']//child::li
		//8.Preceding
		//*[@type='submit']//preceding::input[2]
		//9. Parent
		//*[@type='submit']//parent::td
		//*[@type='submit']/..
		//*[@type='submit']/../..
		
		//10 Following - sibling
		//*[@type='submit']//following-sibling::input
		

	}

}
