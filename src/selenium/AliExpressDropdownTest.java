package selenium;

//done

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AliExpressDropdownTest {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		List<WebElement> popUP = driver.findElements(By.className("_3KrBP"));
		System.out.println(popUP.size());
		
		if(popUP.size()>0) {
			//popUP.get(0).click();
			driver.findElement(By.className("_24EHh")).click();
		}
		List<WebElement> popUP2 = driver.findElements(By.className("poplayer-content"));
		System.out.println(popUP.size());
		
		if(popUP2.size()>0) {
			 //popUP.get(0).click();
			driver.findElement(By.className("btn-close")).click();}
		
		List<WebElement> allList = driver.findElements(By.cssSelector("#search-dropdown-box>option"));
		System.out.println(allList.size());
		
		Thread.sleep(3000);
		
		for (WebElement a : allList) {
			System.out.println(a.getText());
		}
		
		for(int i=0; i<allList.size(); i++) {			
					System.out.println(allList.get(i).getText());
	}
	}
}
