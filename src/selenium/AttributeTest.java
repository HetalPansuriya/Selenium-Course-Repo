package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();		//open Firefox
		driver.get("https://www.ebay.com/");
		
		
		String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(s);
		
		Thread.sleep(3000);
				
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		
		String p = driver.findElement(By.id("gh-ac")).getAttribute("value"); //if you want to read..what you type
		System.out.println(p);
	}

}
