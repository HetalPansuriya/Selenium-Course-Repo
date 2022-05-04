package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class AliExpressHoverTest {

	
	//get women fashion list or whole
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		Thread.sleep(4000);
		
		//List<WebElement> popUP = driver.findElements(By.xpath("//img[@class='header-background']"));
		List<WebElement> popUP = driver.findElements(By.xpath("//svg[@id='iconfont-svg-group']"));
		System.out.println(popUP.size());
		
		if(popUP.size()>0) {
		driver.findElement(By.className("_24EHh")).click();

		}
		Thread.sleep(4000);
		List<WebElement> popUP2 = driver.findElements(By.xpath("//div[class='poplayer-content']"));
		System.out.println(popUP2.size());
		
		if(popUP.size()>0) {
			driver.findElement(By.className("btn-close")).click();
		}
		Thread.sleep(4000);
		WebElement wFashion = driver.findElement(By.xpath("//div[@class='categories']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(wFashion).build().perform();
		
		Thread.sleep(3000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='categories-list-box']/dl"));
		System.out.println(allOptions.size());
	
		for(int i=0; i<allOptions.size(); i++) {
			System.out.println(allOptions .get(i).getText());
		}
}
	}

