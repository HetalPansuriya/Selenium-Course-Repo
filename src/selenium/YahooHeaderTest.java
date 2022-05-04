package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();	
		driver.get("https://ca.yahoo.com/?p=us");

		
		List<WebElement> allLinks1 = driver.findElements(By.xpath("//*[@role='presentation']/li"));
		System.out.println(allLinks1.size());
		
		for(int i=0; i<allLinks1.size(); i++) {
			System.out.println(allLinks1.get(i).getText());
		}	

	}
}
