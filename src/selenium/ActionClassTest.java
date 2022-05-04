package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//This class use to perform hover the mouse somewhere when we need it to see dropdowns or links

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();		//open Firefox
		driver.get("https://www.ebay.ca	/");

		WebElement Electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Electronics).build().perform();
		
		Thread.sleep(3000);
		
		List<WebElement> tabs = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
		System.out.println(tabs.size());
			for(int i=0; i<tabs.size(); i++) {			
				System.out.println(tabs.get(i).getText());
}
	}
	}
