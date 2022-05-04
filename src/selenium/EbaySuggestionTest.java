package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionTest {

	public static void main(String[] args) throws InterruptedException {

		//Typeiphone
		//get size and text
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();		
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");	//from empty box find tag name
		Thread.sleep(2000);

		//get size(10) and text
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[contains(@id,'ui-id-1')]/li"));
		System.out.println(allOptions.size());
		for(WebElement a : allOptions) {
			System.out.println(a.getText());
		}
	}

}
