package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
	
		//type canada
		//size and text

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		//type canada
		driver.findElement(By.name("p")).sendKeys("canada");
		Thread.sleep(2000);

		//get size(10) and text
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(allOptions.size());
		for(WebElement a : allOptions) {
			System.out.println(a.getText());
		}
	}

}
