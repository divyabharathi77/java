

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Democlass {
	
	public static void main(String[] args) 
	{   
		DesiredCapabilities capabilities= new DesiredCapabilities().internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		//System.setProperty("webdriver.chrome.driver","C:\\driverservers\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver","C:\\driverservers\\IEDriverServer.exe");

		WebDriver driver=new InternetExplorerDriver(capabilities);
		driver.get("http://www.google.com");
		driver.findElement(By.id("gsr")).sendKeys("amazon");
		driver.findElement(By.id("gsr")).click();
		driver.quit();
		
		
	}
	

}
