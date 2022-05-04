package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver(); 
		
		driver.get("https://www.facebook.com/");
		
		//we can save email element for rest program just like we save i=10 for whole program
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("yhvhbhbb");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("buvhvjvhj");	
		
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();	
		
	}

}
