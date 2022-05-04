package practiceTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyFullListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.bestbuy.ca/en-ca");
		
		driver.findElement(By.xpath("//span[contains(@data-automation,'x-shop')]")).click();	//from empty box find tag name
		Thread.sleep(2000);

		//get size(10) and text
		List<WebElement> allOptions = driver.findElements(By.xpath("//a[contains(@data-automation,'category')]"));
		System.out.println(allOptions.size());
		for(WebElement a : allOptions) {
			System.out.println(a.getText());
		}
	}

}
