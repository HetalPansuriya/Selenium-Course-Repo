package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
	
		//https://ca.yahoo.com/
		//List of 10 side links and size..list and header
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();		//open Firefox
		driver.get("https://ca.yahoo.com/?p=us");
		
			
		   // List<WebElement> allLst = driver.findElements(By.xpath("//a[@class='D(ib) Td(n):h Td(n) Cur(p) C(#6001d2):h C(#1d2228) Fz(12px) Fw(600) Ell']"));
		    List<WebElement> allList = driver.findElements(By.xpath("//div[@class='bd']//a"));
			System.out.println(allList.size());
			System.out.println(allList.size());
			
			for(int i=0; i<allList.size(); i++) {
				System.out.println(allList.get(i).getText());
		}
	}
}
