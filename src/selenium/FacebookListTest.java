package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();	
		driver.get("https://www.facebook.com/");

		
	    List<WebElement> allLinks1 = driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li"));
		System.out.println(allLinks1.size());
		
		for(int i=0; i<allLinks1.size(); i++) {
			System.out.println(allLinks1.get(i).getText());
	}
	}

}
