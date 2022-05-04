package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();		//open Firefox
		driver.get("https://www.google.com/");
		
		//note: when webelement..element must be present..when list..not necessery
		
		//WebElement firstLink = driver.findElement(By.tagName("vghgctcghvg"));
		
		//WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']")); 	we can use this with bottom line to find 3 links or 
		//List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));		//these 2 lines to get 3 links 
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}
	}
}
