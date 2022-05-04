package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDListTest {

	public static void main(String[] args) {
		// https://www.td.com/ca/en/personal-banking/
		//footer
//size and text

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();		//open Firefox
		driver.get("https://www.td.com/ca/en/personal-banking/");
		
	    List<WebElement> allLinks1 = driver.findElements(By.xpath("//a[@class='td-copy-white td-link-nounderline td-copy-standard']"));
		System.out.println(allLinks1.size());
		
		for(int i=0; i<allLinks1.size(); i++) {
			System.out.println(allLinks1.get(i).getText());
	}
	}

}
