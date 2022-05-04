package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();		//open Firefox
		driver.get("https://www.facebook.com/");  //open facebook
	
		//Selenium has total 8 elements to find something
		
		//Email
		//(1)className- with space directly (_) so we can't use class attribute - not working
		//driver.findElement(By.className("inputText _55r1 _6luy")).sendKeys("hvggvgcf");
		
		//(2)cssSelector -learn syntax for selector - haven't use
		//driver.findelement(By.cssSelector("));
		
		//(3)id attribute-  working
		driver.findElement(By.id("email")).sendKeys("ctgcg");
		
		//(4)linkText- only for links(link start with "a" tag name or "href"..when link is fix
		//driver.findElement(By.linkText("")).
		
		//(5)name-attribute -working
		//driver.findElement(By.name("email")).sendKeys("ftyff");
		
		//(6)partialLinkText-attribute- only for links	......when link is changing
		//driver.findElement(By.partialLinkText(""))
		
		//(7)tagName- must be unique..only one in program - not working
		//driver.findElement(By.tagName("input")).sendKeys("hvhvjggc");
		
		//(8)xPath-learn syntax for xPath
		//same as cssSelector
		//driver.findElement(By.xpath(null))
		
		//password
		//driver.findElement(By.name("pass")).sendKeys("bubej"); //working
		
		//login Button
		//driver.findElement(By.tagName("Button")).click();
	}

}
