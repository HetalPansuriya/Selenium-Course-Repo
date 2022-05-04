package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AliexpressSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");

		//Type Computer
		//Get size and text

		List<WebElement> popUP = driver.findElements(By.className("poplayer-content"));
		System.out.println(popUP.size());
		
		if(popUP.size()>0) {
			//popUP.get(0).click();
			driver.findElement(By.className("btn-close")).click();
		}
		List<WebElement> popUP2 = driver.findElements(By.className("_24EHh"));
		System.out.println(popUP.size());
		
		if(popUP2.size()>0) {
			 //popUP.get(0).click();
			driver.findElement(By.className("_24EHh")).click();}
		
		Thread.sleep(8000);
		
		driver.findElement(By.id("search-key")).sendKeys("Computer");
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@data-role='items']/li"));
		System.out.println(allOptions.size());
		for(WebElement a : allOptions) {
			System.out.println(a.getText());
		}
	}

}
