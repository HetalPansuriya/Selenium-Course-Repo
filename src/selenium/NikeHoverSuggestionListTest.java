package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeHoverSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		// hover second column and get size and text

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		

		WebElement signIn = driver.findElement(By.xpath("//a[@aria-label='Men']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(signIn).build().perform();
		
		Thread.sleep(3000);
		List<WebElement> tabs = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men,')]"));
		System.out.println(tabs.size());
			for(int i=0; i<tabs.size(); i++) {			
				System.out.println(tabs.get(i).getText());
	}

}
}

	


