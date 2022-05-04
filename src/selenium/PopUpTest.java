package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PopUpTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");

		//if you get the PopUp....>close PopUp.....>Type Computer in the search box
		//if you don't get PopUp...>Type Computer in the search box
		
		List<WebElement> popUP = driver.findElements(By.className("close-btn"));
		System.out.println(popUP.size());
		
		if(popUP.size()>0) {
			//popUP.get(0).click();
			driver.findElement(By.className("close-btn")).click();
		}
		List<WebElement> popUP2 = driver.findElements(By.className("_24EHh"));
		System.out.println(popUP.size());
		
		if(popUP2.size()>0) {
			 //popUP.get(0).click();
			driver.findElement(By.className("_24EHh")).click();}
		
	//	List<WebElement> allList = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
	//	System.out.println(allList.size());
		
	//	for (WebElement a : allList) {
	//		System.out.println(a.getText());//to select default option like "all Categories" which we want to keep default
		//}

		
			driver.findElement(By.id("search-key")).sendKeys("computer");	
	}
}
