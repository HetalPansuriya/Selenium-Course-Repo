package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeader {

	public static void main(String[] args) //throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();		//open Firefox
		driver.get("https://www.ebay.ca/");
		
		
	    List<WebElement> allList = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li"));
		System.out.println(allList.size());
		
		for (WebElement a : allList) {
			System.out.println(a.getText());
		}
		
		//or
		
		//for(int i=0; i<allList.size(); i++) {
		//	System.out.println(allList.get(i).getText());
		
		//String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		//	System.out.println(s);
			
		//Thread.sleep(5000);
					
		//	driver.findElement(By.id("gh-ac")).sendKeys("iphone");
			
		//String p = driver.findElement(By.id("gh-ac")).getAttribute("value"); //if you want to read..what you type
		//System.out.println(p);}
	}
	}

