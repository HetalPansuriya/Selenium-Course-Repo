package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();	
		driver.get("https://www.amazon.ca/");
		
		//hover on sign in and get size and text

		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
		Actions builder = new Actions(driver);
		builder.moveToElement(signIn).build().perform();
		
		Thread.sleep(3000);
		List<WebElement> tabs = driver.findElements(By.xpath("//a[@class='nav-link nav-item']"));
		System.out.println(tabs.size());
			for(int i=0; i<tabs.size(); i++) {			
				System.out.println(tabs.get(i).getText());
}
	}

}
