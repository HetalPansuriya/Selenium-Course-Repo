package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDriverTest {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("bevhtgvhh");		//fill last name
		driver.findElement(By.name("pass")).sendKeys("vevhvhv");	//fill mobile number
		driver.findElement(By.name("login")).click();
	}

}
