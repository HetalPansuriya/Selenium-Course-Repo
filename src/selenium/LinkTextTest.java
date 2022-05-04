package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		driver.findElement(By.linkText("About")).click();
		//driver.findElement(By.partialLinkText("Abo")).click();
		
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		wait.until(ExpectedConditions.urlContains("https://about.google"));
		String expctedUrl = "https://about.google";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(expectedTitle.equals(actualTitle) & actualUrl.contains(expctedUrl)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
	}

}
