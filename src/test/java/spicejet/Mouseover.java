package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import facebook_automation.Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseover{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
		WebElement mouseovr =driver.findElement(By.linkText("LOGIN / SIGNUP"));
		Actions mouse =new Actions(driver);
		mouse.moveToElement(mouseovr).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Travel Agent Login")).click();
		driver.navigate().back();
		 WebElement from =driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		from.click();
		System.out.println(from.isSelected());
		WebElement tirupathi=driver.findElement(By.linkText("Tirupati (TIR)"));
		tirupathi.click();
		System.out.println(tirupathi.getText());
		WebElement depart=driver.findElement(By.linkText("Goa (GOI)"));
		depart.click();
		/*System.out.println(depart.getText());
		WebElement fromdate=driver.findElement(By.name("ctl00$mainContent$view_date1"));
		fromdate.click();
		WebElement selectdate=driver.findElement(By.xpath("//td[@class='ui-datepicker-week-end ui-datepicker-other-month ui-datepicker-unselectable ui-state-disabled']"));
		WebElement date=driver.findElement(By.linkText("27"));
		mouse.moveToElement(date).perform();*/
		
		/*WebElement returndate=driver.findElement(By.name("ctl00$mainContent$view_date2"));
		returndate.click();
		returndate.sendKeys("26/02/2019");*/
		//------------------checkbox--------------------------
		WebElement checkbox=driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		checkbox.click();
		WebElement radiobutton=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
	    radiobutton.click();
	    
	    mouse.sendKeys(Keys.PAGE_DOWN).build().perform();
	    Thread.sleep(3000);
	    driver.close();
		
	
		
		
         		

	}

}
