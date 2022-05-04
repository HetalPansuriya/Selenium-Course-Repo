package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpPracticTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");

		List<WebElement> popUP = driver.findElements(By.className("_24EHh"));
		System.out.println(popUP.size());
		
		if(popUP.size()>0) {
			 //popUP.get(0).click();
			driver.findElement(By.className("_24EHh")).click();}
			driver.findElement(By.id("search-key")).sendKeys("computer");
		}		
	}