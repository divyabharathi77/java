

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Configbrowsersetting {

	public static void main(String[] args) {
		
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
