package spicejet;

import org.openqa.selenium.edge.EdgeDriver;

public class Driverclass {
	
	 public void chromedriver(){
		 

			/*DesiredCapabilities capabilities=DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			*/
			System.setProperty("webdriver.chrome.driver","C:\\driverservers\\MicrosoftWebDriver.exe");
	        //EdgeDriver driver= new EdgeDriver();//depracated
			/*driver.get("https://www.google.com");
			driver.getTitle();
*/
		 
	 }
	public void internetexplorer(){
		
		

		/*DesiredCapabilities capabilities=DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		*/
		System.setProperty("webdriver.edge.driver","C:\\driverservers\\MicrosoftWebDriver.exe");
        EdgeDriver driver= new EdgeDriver();//depracated
		driver.get("https://www.google.com");
		driver.getTitle();

		
		
	}
	public void firefox(){
		

		/*DesiredCapabilities capabilities=DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		*/
		System.setProperty("webdriver.edge.driver","C:\\driverservers\\MicrosoftWebDriver.exe");
        EdgeDriver driver= new EdgeDriver();//depracated
		driver.get("https://www.google.com");
		driver.getTitle();

		
	}
	
	
	

}
