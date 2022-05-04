package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();		//open Firefox
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("bevh"); // fill last name
		driver.findElement(By.cssSelector("#pass")).sendKeys("vevh"); // fill mobile number
		driver.findElement(By.cssSelector("button[name='login']")).click();; // fill password

	}

}
