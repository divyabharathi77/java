package facebook_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) {
		
	
       WebDriverManager.chromedriver().setup();
	   WebDriver driver= new ChromeDriver();
	   driver.get("https://www.facebook.com");
	   driver.manage().window().maximize();
	   //System.out.println(driver.getTitle());
	  try{
	   WebElement search= driver.findElement(By.name("email"));
	  // setElementConverter(org.openqa.selenium.remote.internal.JsonToWebElementConverter converter);
	   search.sendKeys("dpcindrella16@gmail.com");
	   WebElement password=driver.findElement(By.id("pass"));
	   password.sendKeys("kiranlove<3");
	   driver.findElement(By.id("loginbutton")).click();
	   // search.sendKeys("facebook");
	   // driver.findElement(By.name("email")).click
      WebElement logout= driver.findElement(By.linkText("Log Out"));
	   logout.click();}
	  catch(Exception e){
		  e.printStackTrace();
		  System.out.println("there is an exception");
	  }
	  finally{
		  
		  System.out.println("resulted in error");
	  }
	  
	/*System.out.println(logout.getAttribute("value"));
	System.out.println(logout.getText());
	System.out.println(logout.getSize());*/
	driver.close();
	}
}
